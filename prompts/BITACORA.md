# Bitacora de tecnicas avanzadas

Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: (escribe aqui cual usaste)

## Ejercicio 2: Zero-shot, one-shot y few-shot
| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) |
|------|-----------------|-------------------------|------------------------------------|
| Zero-shot|5|lista estructurada con viñetas en dos niveles|si|
| One-shot |5|lista numerada directa |si|
| Few-shot |5|"Texto del comentario" -> Clasificación |si |

## Ejercicio 3: Chain of Thought
| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo | 318.60|no|si |
| Paso a paso |318.60|si|si |
Es importante ver el razonamientp ya que pudo haberinventado 
un dato adicional para llegar a la respuesta
## Ejercicio 4: Role prompting
| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas |
|---------|-------------------------------|-----------------------|----------------------|
| A. Sin rol |sencillo|si |a quien quiera una breve explicación. |
| B. Rol docente |tecnico|si |esta enfoca más a los estudiantes  |
| C. Rol senior |técnico|si|alguine que se interesa mas en el tema y se dedica a la programacion |
```text
(Los casos de prueba para un módulo de **Login** se dividen según el objetivo que se busca validar. A continuación, tienes una suite organizada por categorías:

### 1. Casos de Prueba Funcionales (Camino Feliz y Excepciones)

| ID | Título del Caso | Pasos de Ejecución | Datos de Entrada | Resultado Esperado |
| --- | --- | --- | --- | --- |
| **TC-01** | Login exitoso con credenciales válidas | 1. Ingresar usuario válido.<br>

<br>2. Ingresar contraseña válida.<br>

<br>3. Hacer clic en "Iniciar sesión". | **Usuario:** `user@test.com`<br>

<br>**Pass:** `Password123!` | Redirección al Dashboard o pantalla principal. Sesión iniciada correctamente. |
| **TC-02** | Contraseña incorrecta | 1. Ingresar usuario válido.<br>

<br>2. Ingresar contraseña errónea.<br>

<br>3. Hacer clic en "Iniciar sesión". | **Usuario:** `user@test.com`<br>

<br>**Pass:** `WrongPass1` | Mensaje de error: *"Usuario o contraseña incorrectos"*. Permanecer en el login. |
| **TC-03** | Usuario no registrado | 1. Ingresar correo no existente.<br>

<br>2. Ingresar contraseña cualquiera.<br>

<br>3. Hacer clic en "Iniciar sesión". | **Usuario:** `notfound@test.com`<br>

<br>**Pass:** `Password123!` | Mensaje de error: *"Usuario o contraseña incorrectos"* (Evitar indicar cuál de los dos es inválido por seguridad). |
| **TC-04** | Campos vacíos | 1. Dejar campos en blanco.<br>

<br>2. Hacer clic en "Iniciar sesión". | **Usuario:** ` ` (Vacío)<br>

<br>**Pass:** ` ` (Vacío) | Validación de campos requeridos (ej. *"Este campo es obligatorio"*). Botón bloqueado o alerta. |

---

### 2. Validaciones de Interfaz de Usuario y UX

* **TC-05 (Máscara de contraseña):** Verificar que la contraseña se muestre enmascarada (con puntos `•••••` o asteriscos `*****`) por defecto.
* **TC-06 (Mostrar/Ocultar contraseña):** Hacer clic en el icono del "ojo" para alternar la visibilidad de la contraseña en texto plano y enmascarado.
* **TC-07 (Navegación por teclado):** Verificar que con la tecla `TAB` se pueda navegar secuencialmente de *Usuario $\rightarrow$ Contraseña $\rightarrow$ Botón de Login $\rightarrow$ Recordarme / Olvidé mi contraseña*.
* **TC-08 (Tecla Enter):** Llenar los campos y presionar la tecla `ENTER` para enviar el formulario sin hacer clic explícito en el botón.
* **TC-09 (Sensibilidad a mayúsculas/minúsculas):** Verificar que la contraseña valide diferencias entre mayúsculas y minúsculas (ej: `Password123!` vs `password123!`).

---

### 3. Casos de Seguridad

* **TC-10 (Bloqueo por intentos fallidos):** Intentar iniciar sesión con contraseña incorrecta 3 o 5 veces consecutivas.
* *Resultado esperado:* La cuenta debe bloquearse temporalmente (ej. por 15 minutos) o requerir un CAPTCHA.


* **TC-11 (Inyección SQL):** Ingresar payloads como `' OR '1'='1` en el campo de usuario o contraseña.
* *Resultado esperado:* El sistema debe rechazar los caracteres/entrada y no permitir el acceso ni arrojar errores de base de datos.


* **TC-12 (Cross-Site Scripting - XSS):** Ingresar scripts como `<script>alert('xss')</script>` en el campo de usuario.
* *Resultado esperado:* La entrada debe ser sanitizada y mostrada como texto plano sin ejecutar el código.


* **TC-13 (Cierre de sesión y botón 'Atrás'):** Iniciar sesión, cerrar sesión y presionar el botón "Atrás" del navegador.
* *Resultado esperado:* No debe permitir ver la pantalla anterior del usuario sin autenticarse de nuevo.



---

### 4. Integraciones y Funcionalidades Adicionales

* **TC-14 (Enlace "Olvidé mi contraseña"):** Hacer clic en el enlace y comprobar que redirige al flujo de recuperación de contraseña enviando un correo válido.
* **TC-15 (Casilla "Recordarme"):** Marcar "Recordarme", iniciar sesión, cerrar el navegador, volver a abrir la URL y verificar si la sesión sigue activa o si el usuario quedó guardado.
* **TC-16 (Login Social):** Probar el inicio de sesión mediante terceros (Google, Apple, Facebook) verificando la redirección del proveedor OAuth y la creación o vinculo exitoso de la cuenta.)
```
## Ejercicio 5: Descomposicion
| Paso | Mensaje |
| :---: | :--- |
| 1 | Voy a crear un sistema de inventario para una tienda pequena en Java. Lista los 5 requisitos principales del sistema. |
| 2 | Con esos requisitos, disena las clases necesarias. Para cada clase indica sus atributos con su tipo de dato. |
| 3 | Escribe el codigo Java de la clase Producto con sus atributos, un constructor y los metodos get y set. |
| 4 | Revisa el codigo de la clase Producto y propone 3 mejoras concretas. |
## Ejercicio 6: Prompt estructurado y autocritica
**4. Evaluar.** Revisa la tabla final y anota en tu bitácora:

| Qué revisar | Cumple (Sí / No) |
| :--- | :---: |
| ¿Tiene las 4 columnas pedidas? | si |
| ¿Incluye el bloqueo después de 3 intentos? | si |
| ¿Incluye casos con campos vacíos? | si |
| ¿Indica qué casos agregó en la autocrítica? | si |
| ¿Hay algún caso repetido o que no tenga sentido? | si |
## Ejercicio 7 : publicar la bitacora en git hub
