# Implementación de POO en un sistema de gestión de calidad

La empresa necesita un sistema robusto y escalable para gestionar la calidad del software. El sistema debe manejar conexiones a bases de datos, gestionar excepciones, implementar interfaces y clases abstractas, utilizar colecciones, integrar bibliotecas y frameworks, y aplicar patrones de diseño orientados a objetos. Además, debe ser compatible con herramientas de pruebas unitarias para asegurar la calidad del código.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Implementación de programación orientada a objetos (POO) - avanzado |
| **Nivel** | senior-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 10-12 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Diseño del sistema

**Objetivo:** Definir la arquitectura del sistema y sus componentes principales.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los componentes clave del sistema (base de datos, interfaz de usuario, lógica de negocio).
- Define las interfaces y clases abstractas que serán utilizadas.
- Establece las conexiones necesarias con la base de datos.

**Entregable:** Diagrama de componentes y descripción de interfaces y clases abstractas.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo separar las preocupaciones en diferentes componentes.
- Considera cómo las interfaces pueden facilitar la extensión y mantenimiento del sistema.

</details>

### Fase 2: Implementación de la lógica de negocio

**Objetivo:** Implementar la lógica de negocio utilizando patrones de diseño orientados a objetos.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Implementa las clases concretas que heredan de las clases abstractas definidas en la fase anterior.
- Aplica patrones de diseño como el patrón de fábrica, el patrón de estrategia, etc.
- Maneja excepciones y asegura que el sistema sea robusto frente a errores.

**Entregable:** Código implementado de la lógica de negocio con patrones de diseño aplicados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los patrones de diseño pueden simplificar y mejorar la mantenibilidad del código.
- Considera cómo manejarías diferentes tipos de excepciones en tu sistema.

</details>

### Fase 3: Integración de bibliotecas y frameworks

**Objetivo:** Integrar bibliotecas y frameworks para mejorar la funcionalidad del sistema.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identifica las bibliotecas y frameworks que pueden ser útiles para tu sistema.
- Integra estas bibliotecas y frameworks en tu código.
- Asegura que la integración no afecte negativamente la performance del sistema.

**Entregable:** Código integrado con bibliotecas y frameworks.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga las mejores prácticas para integrar bibliotecas y frameworks en tu sistema.
- Considera el impacto en la performance al integrar nuevas dependencias.

</details>

### Fase 4: Pruebas unitarias y aseguramiento de la calidad

**Objetivo:** Implementar pruebas unitarias para asegurar la calidad del código.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseña y escribe pruebas unitarias para los componentes clave del sistema.
- Utiliza herramientas de pruebas unitarias para ejecutar y validar las pruebas.
- Asegura que el código cumpla con los estándares de calidad establecidos.

**Entregable:** Conjunto de pruebas unitarias y reporte de cobertura de código.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las pruebas unitarias son esenciales para asegurar la calidad del código.
- Considera cómo podrías mejorar la cobertura de pruebas en tu sistema.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación orientada a objetos y por qué es importante en este sistema?
- **paraQueSirve**: ¿Para qué sirven las interfaces y clases abstractas en tu diseño?
- **comoSeUsa**: ¿Cómo aplicaste un patrón de diseño en tu lógica de negocio?
- **erroresComunes**: ¿Qué errores comunes encontraste al manejar excepciones y cómo los solucionaste?
- **queDecisionesImplica**: ¿Qué decisiones tomaste al integrar bibliotecas y frameworks y por qué?

## Criterios de Evaluacion

- Diseño del sistema con componentes bien definidos.
- Implementación de la lógica de negocio con patrones de diseño aplicados.
- Integración efectiva de bibliotecas y frameworks.
- Pruebas unitarias que aseguran la calidad del código.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
