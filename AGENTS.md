# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Calidad de Software, Especialidad Automatizador, Seniority Senior

### Brecha de conocimiento
Demuestra un dominio avanzado en al menos uno (1) de los siguientes lenguajes de Programación Orientada a Objetos: Java, Python, dart, JavaScript, TypeScript., en temas clave como: conexiones a base de datos, manejo de excepciones, interfaces, clases abstractas, colecciones, uso de bibliotecas/frameworks, patrones de diseño orientados a objetos, herramientas de pruebas unitarias

### Misión / candidato
Candidata Senior en el área de Calidad de Software especializada en automatización

### Reto
- Tema: Implementación de programación orientada a objetos (POO) - avanzado
- Seniority: senior-l3
- Tipo: practical
- Título: Implementación de POO en un sistema de gestión de calidad
- Tiempo estimado: 10-12 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Diseño del sistema — objetivo: Definir la arquitectura del sistema y sus componentes principales. — entregable (NO resolver): Diagrama de componentes y descripción de interfaces y clases abstractas.
- Fase 2: Implementación de la lógica de negocio — objetivo: Implementar la lógica de negocio utilizando patrones de diseño orientados a objetos. — entregable (NO resolver): Código implementado de la lógica de negocio con patrones de diseño aplicados.
- Fase 3: Integración de bibliotecas y frameworks — objetivo: Integrar bibliotecas y frameworks para mejorar la funcionalidad del sistema. — entregable (NO resolver): Código integrado con bibliotecas y frameworks.
- Fase 4: Pruebas unitarias y aseguramiento de la calidad — objetivo: Implementar pruebas unitarias para asegurar la calidad del código. — entregable (NO resolver): Conjunto de pruebas unitarias y reporte de cobertura de código.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación o descripciones sin código, genera los archivos
correspondientes sin aplicar análisis de compilación
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

src/main/java/com/pragma/quality/QualityManagementApplication.java
package com.pragma.quality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QualityManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(QualityManagementApplication.class, args);
    }
}

// === ARCHIVO: src/main/java/com/pragma/quality/domain/QualityDomain.java ===
package com.pragma.quality.domain;

public interface QualityDomain {
    // Definiciones de interfaces y clases abstractas
}

// === ARCHIVO: src/main/java/com/pragma/quality/application/QualityService.java ===
package com.pragma.quality.application;

import com.pragma.quality.domain.QualityDomain;
import com.pragma.quality.infrastructure.QualityRepository;
import org.springframework.stereotype.Service;

@Service
public class QualityService implements QualityDomain {
    private final QualityRepository repository;

    public QualityService(QualityRepository repository) {
        this.repository = repository;
    }

    // Implementación de la lógica de negocio
}

// === ARCHIVO: src/main/java/com/pragma/quality/infrastructure/QualityRepository.java ===
package com.pragma.quality.infrastructure;

import com.pragma.quality.domain.QualityDomain;
import org.springframework.stereotype.Repository;

@Repository
public class QualityRepository implements QualityDomain {
    // Implementación de la capa de infraestructura para la gestión de datos
}

// === ARCHIVO: src/main/resources/application.properties ===
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

// === ARCHIVO: src/test/java/com/pragma/quality/QualityServiceTest.java ===
package com.pragma.quality.application;

import com.pragma.quality.infrastructure.QualityRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class QualityServiceTest {

    @Mock
    private QualityRepository repository;

    @InjectMocks
    private QualityService service;

    public QualityServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testServiceMethod() {
        // Arrange
        // Act
        // Assert
    }
}

// === ARCHIVO: src/main/java/com/pragma/quality/exception/NotFoundException.java ===
package com.pragma.quality.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}

// === ARCHIVO: src/main/java/com/pragma/quality/exception/BadRequestException.java ===
package com.pragma.quality.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}

// === ARCHIVO: src/main/java/com/pragma/quality/exception/InternalServerErrorException.java ===
package com.pragma.quality.exception;

public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String message) {
        super(message);
    }
}

// === ARCHIVO: src/main/java/com/pragma/quality/exception/GlobalExceptionHandler.java ===
package com.pragma.quality.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(NotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> handleBadRequestException(BadRequestException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<String> handleInternalServerErrorException(InternalServerErrorException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

// === ARCHIVO: src/test/java/com/pragma/quality/application/QualityServiceTest.java ===
package com.pragma.quality.application;

import com.pragma.quality.infrastructure.QualityRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class QualityServiceTest {

    @Mock
    private QualityRepository repository;

    @InjectMocks
    private QualityService service;

    public QualityServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testServiceMethod1() {
        // Arrange
        // Act
        // Assert
        assertNotNull(service);
    }

    @Test
    void testServiceMethod2() {
        // Arrange
        // Act
        // Assert
        assertNotNull(service);
    }

    @Test
    void testServiceMethod3() {
        // Arrange
        // Act
        // Assert
        assertNotNull(service);
    }
}

```
