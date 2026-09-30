# Tarea: Mi prompt avanzado

## Tarea elegida
Generar casos de prueba para el módulo de registro de nuevos usuarios en una aplicación web.

---

## Version 1: prompt basico
Dame casos de prueba para un registro de usuarios.

## Version 2
Actúa como un programador senior. 
Escribe casos de prueba para el registro de usuarios que requiere:
- Nombre completo
- Correo electrónico válido
- Contraseña (mínimo 8 caracteres, al menos un número y un símbolo)

Muestra tu razonamiento paso a paso sobre qué posibles escenarios de error pueden ocurrir antes de generar la lista final.
## Version 3: prompt final
<rol>
Actúa como un programador senior especialista en pruebas funcionales de software.
</rol>

<contexto>
Estamos probando un formulario web de registro de usuarios. Los campos son:
1. Nombre completo (obligatorio, texto).
2. Correo electrónico (obligatorio, formato válido de e-mail).
3. Contraseña (mínimo 8 caracteres, al menos 1 número y 1 carácter especial).
</contexto>

<tarea>
Analiza paso a paso todos los escenarios posibles (flujo principal, errores de validación, casos límite) y genera una lista completa de casos de prueba.
</tarea>

<ejemplos>
Formato esperado por cada caso de prueba:
| ID | Escenario | Datos de Entrada | Resultado Esperado |
| TC-01 | Registro exitoso | Nombre: Juan Pérez, Correo: juan@test.com, Clave: Abc1234! | Cuenta creada correctamente y redirección al Login. |
</ejemplos>

<formato>
Responde únicamente con la tabla en formato Markdown usando la estructura mostrada en los ejemplos.
</formato>

<autocritica>
Al finalizar la tabla, revisa si incluiste casos como contraseñas con espacios, correos duplicados o inyección SQL básica. Si no los incluiste, agrégalos a la tabla e indica cuáles agregaste en tu autocrítica.
</autocritica>

## Tecnicas usadas en el prompt final
1. Role prompting
2. Chain of Thought
3.Few-shot
4.Autocrítica
## Evaluacion del resultado
## Evaluación del resultado

| Criterio de Evaluación | Cumple (Sí / No) |
| :--- | :---: |
| ¿Incluye al menos 3 técnicas de prompting identificables? | Sí |
| ¿Se definió un rol específico y un formato claro? | Sí |
| ¿La salida final se presenta en una tabla Markdown organizada? | Sí |
| ¿La autocrítica identificó e incluyó casos límite no previstos? | Sí |
## Por que elegi estas tecnicas
Elegí Role prompting para enfocar a la IA desde la perspectiva detallista de un QA Engineer. Combiné Chain of Thought y Prompt estructurado para garantizar un análisis ordenado de escenarios sin que las instrucciones de contexto se mezclen con el formato. Finalmente, integré Few-shot y Autocrítica para estandarizar la salida en una tabla lista para documentar y asegurar la inclusión de casos borde (edge cases) de seguridad o caracteres especiales