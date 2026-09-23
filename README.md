# Implementación avanzada de POO en un sistema de gestión de pedidos

Necesitamos desarrollar un sistema de gestión de pedidos para una tienda en línea que opere en un dominio de comercio electrónico. El sistema debe manejar la creación, modificación y cancelación de pedidos, así como la gestión de productos y usuarios. El objetivo es demostrar un dominio avanzado de la programación orientada a objetos, incluyendo la implementación de clases, interfaces, manejo de excepciones, y patrones de diseño.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Implementación de programación orientada a objetos (POO) - avanzado |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8-10 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado del dominio

**Objetivo:** Definir las clases y relaciones necesarias para representar el dominio del sistema de gestión de pedidos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los principales elementos del dominio (pedidos, productos, usuarios) y sus relaciones.
- Diseña las clases y sus atributos para representar estos elementos.

**Entregable:** Diagrama de clases y descripción de las relaciones entre ellas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la herencia y la composición para modelar las relaciones entre clases.
- Piensa en cómo representar las restricciones de negocio (por ejemplo, un producto no puede tener un precio negativo).

</details>

### Fase 2: Implementación de clases y métodos

**Objetivo:** Implementar las clases y métodos necesarios para manejar la lógica del dominio.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa las clases y métodos para crear, modificar y cancelar pedidos.
- Asegúrate de manejar adecuadamente las excepciones y validaciones.

**Entregable:** Código fuente de las clases y métodos implementados.

<details>
<summary>Pistas de conocimiento</summary>

- Usa excepciones personalizadas para manejar errores específicos del dominio.
- Considera el uso de patrones de diseño para mejorar la estructura y reutilización del código.

</details>

### Fase 3: Integración y pruebas

**Objetivo:** Integrar las clases implementadas y realizar pruebas unitarias para verificar su correcto funcionamiento.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Integra las clases y métodos en un sistema funcional.
- Escribe pruebas unitarias para verificar el correcto funcionamiento de las clases y métodos.

**Entregable:** Código fuente integrado y pruebas unitarias.

<details>
<summary>Pistas de conocimiento</summary>

- Usa herramientas de pruebas unitarias para verificar el comportamiento de las clases y métodos.
- Considera escenarios de prueba que cubran tanto los casos felices como los edge cases.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué representa cada clase en el dominio del sistema de gestión de pedidos?
- **paraQueSirve**: ¿Para qué sirve cada método implementado en las clases?
- **comoSeUsa**: ¿Cómo se usan las excepciones personalizadas en el manejo de errores del sistema?
- **erroresComunes**: ¿Qué errores comunes pueden ocurrir al crear un pedido y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones de diseño tomaste al implementar las clases y métodos?

## Criterios de Evaluacion

- Modelo de dominio completo y coherente.
- Clases y métodos implementados correctamente.
- Manejo adecuado de excepciones y validaciones.
- Pruebas unitarias que cubren casos felices y edge cases.
- Decisiones de diseño justificadas y documentadas.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
