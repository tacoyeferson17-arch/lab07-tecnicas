import java.math.BigDecimal;
import java.util.Objects;

/**
 * Clase que representa un Producto dentro del sistema de inventario.
 * Incluye validaciones de integridad de datos y métodos de dominio.
 */
public class Producto {

    private Long idProducto;
    private String codigoBarras;
    private String nombre;
    private String descripcion;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private int stockActual;
    private int stockMinimo;
    private String categoria;

    // Constructor por defecto
    public Producto() {
    }

    // Constructor completo
    public Producto(Long idProducto, String codigoBarras, String nombre, String descripcion,
                    BigDecimal precioCompra, BigDecimal precioVenta, int stockActual, 
                    int stockMinimo, String categoria) {
        setIdProducto(idProducto);
        setCodigoBarras(codigoBarras);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setStockActual(stockActual);
        setStockMinimo(stockMinimo);
        setCategoria(categoria);
    }

    // --- Métodos de Dominio ---

    public void ingresarStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a ingresar debe ser mayor a cero.");
        }
        this.stockActual += cantidad;
    }

    public void descontarStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a descontar debe ser mayor a cero.");
        }
        if (cantidad > this.stockActual) {
            throw new IllegalStateException("Stock insuficiente para realizar la salida. Disponible: " + this.stockActual);
        }
        this.stockActual -= cantidad;
    }

    public boolean requiereReabastecimiento() {
        return this.stockActual <= this.stockMinimo;
    }

    // --- Getters y Setters ---

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        if (precioCompra != null && precioCompra.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El precio de compra no puede ser negativo.");
        }
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        if (precioVenta != null && precioVenta.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El precio de venta no puede ser negativo.");
        }
        this.precioVenta = precioVenta;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        if (stockActual < 0) {
            throw new IllegalArgumentException("El stock actual no puede ser negativo.");
        }
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo < 0) {
            throw new IllegalArgumentException("El stock mínimo no puede ser negativo.");
        }
        this.stockMinimo = stockMinimo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // --- Sobrescritura de métodos de Object ---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        
        if (idProducto != null && producto.idProducto != null) {
            return Objects.equals(idProducto, producto.idProducto);
        }
        return Objects.equals(codigoBarras, producto.codigoBarras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto != null ? idProducto : codigoBarras);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + idProducto +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioVenta=" + precioVenta +
                ", stockActual=" + stockActual +
                ", stockMinimo=" + stockMinimo +
                '}';
    }

    // --- Método principal de ejecución ---
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setIdProducto(1L);
        p.setNombre("Laptop");
        p.setStockActual(10);
        p.setStockMinimo(2);

        System.out.println("¡Producto creado correctamente!");
        System.out.println(p.toString());
    }
}