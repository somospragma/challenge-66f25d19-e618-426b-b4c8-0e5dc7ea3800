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
- Seniority: senior-l2
- Tipo: practical
- Título: Implementación avanzada de POO en un sistema de gestión de pedidos
- Tiempo estimado: 8-10 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Modelado del dominio — objetivo: Definir las clases y relaciones necesarias para representar el dominio del sistema de gestión de pedidos. — entregable (NO resolver): Diagrama de clases y descripción de las relaciones entre ellas.
- Fase 2: Implementación de clases y métodos — objetivo: Implementar las clases y métodos necesarios para manejar la lógica del dominio. — entregable (NO resolver): Código fuente de las clases y métodos implementados.
- Fase 3: Integración y pruebas — objetivo: Integrar las clases implementadas y realizar pruebas unitarias para verificar su correcto funcionamiento. — entregable (NO resolver): Código fuente integrado y pruebas unitarias.

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

// === ARCHIVO: src/main/java/com/pragma/ecommerce/domain/model/Order.java ===
package com.pragma.ecommerce.domain.model;

import java.util.List;

public class Order {
    private Long id;
    private User user;
    private List<Product> products;
    private OrderStatus status;

    public Order(Long id, User user, List<Product> products, OrderStatus status) {
        this.id = id;
        this.user = user;
        this.products = products;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

// === ARCHIVO: src/main/java/com/pragma/ecommerce/domain/model/Product.java ===
package com.pragma.ecommerce.domain.model;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// === ARCHIVO: src/main/java/com/pragma/ecommerce/domain/model/User.java ===
package com.pragma.ecommerce.domain.model;

public class User {
    private Long id;
    private String name;
    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// === ARCHIVO: src/main/java/com/pragma/ecommerce/application/service/OrderService.java ===
package com.pragma.ecommerce.application.service;

import com.pragma.ecommerce.domain.model.Order;
import com.pragma.ecommerce.domain.model.Product;
import com.pragma.ecommerce.domain.model.User;
import com.pragma.ecommerce.infrastructure.exception.OrderNotFoundException;
import com.pragma.ecommerce.infrastructure.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(User user, List<Product> products) {
        Order order = new Order(null, user, products, OrderStatus.CREATED);
        return orderRepository.save(order);
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("Order not found"));
    }

    public void cancelOrder(Long id) {
        Order order = getOrder(id);
        order.setStatus(OrderStatus.CANCELLED);
        orderRepository.save(order);
    }
}

// === ARCHIVO: src/main/java/com/pragma/ecommerce/infrastructure/repository/OrderRepository.java ===
package com.pragma.ecommerce.infrastructure.repository;

import com.pragma.ecommerce.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

// === ARCHIVO: src/main/java/com/pragma/ecommerce/infrastructure/exception/OrderNotFoundException.java ===
package com.pragma.ecommerce.infrastructure.exception;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String message) {
        super(message);
    }
}

// === ARCHIVO: src/main/java/com/pragma/ecommerce/infrastructure/exception/GlobalExceptionHandler.java ===
package com.pragma.ecommerce.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<String> handleOrderNotFoundException(OrderNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}

// === ARCHIVO: src/test/java/com/pragma/ecommerce/domain/model/OrderTest.java ===
package com.pragma.ecommerce.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void testOrderCreation() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(1L, user, List.of(product), OrderStatus.CREATED);
        assertEquals(1L, order.getId());
        assertEquals(user, order.getUser());
        assertEquals(List.of(product), order.getProducts());
        assertEquals(OrderStatus.CREATED, order.getStatus());
    }
}

// === ARCHIVO: src/test/java/com/pragma/ecommerce/application/service/OrderServiceTest.java ===
package com.pragma.ecommerce.application.service;

import com.pragma.ecommerce.domain.model.Order;
import com.pragma.ecommerce.domain.model.Product;
import com.pragma.ecommerce.domain.model.User;
import com.pragma.ecommerce.infrastructure.exception.OrderNotFoundException;
import com.pragma.ecommerce.infrastructure.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateOrder() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(null, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.save(order)).thenReturn(order);
        Order createdOrder = orderService.createOrder(user, List.of(product));
        assertEquals(order, createdOrder);
    }

    @Test
    public void testGetOrder() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(1L, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.findById(1L)).thenReturn(java.util.Optional.of(order));
        Order retrievedOrder = orderService.getOrder(1L);
        assertEquals(order, retrievedOrder);
    }

    @Test
    public void testGetOrderNotFound() {
        when(orderRepository.findById(1L)).thenReturn(java.util.Optional.empty());
        assertThrows(OrderNotFoundException.class, () -> orderService.getOrder(1L));
    }
}

// === ARCHIVO: src/test/java/com/pragma/ecommerce/infrastructure/repository/OrderRepositoryTest.java ===
package com.pragma.ecommerce.infrastructure.repository;

import com.pragma.ecommerce.domain.model.Order;
import com.pragma.ecommerce.domain.model.Product;
import com.pragma.ecommerce.domain.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class OrderRepositoryTest {
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveOrder() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(null, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.save(order)).thenReturn(order);
        Order savedOrder = orderRepository.save(order);
        assertEquals(order, savedOrder);
    }

    @Test
    public void testFindOrderById() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(1L, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.findById(1L)).thenReturn(Optional.of(order));
        Order retrievedOrder = orderRepository.findById(1L).orElse(null);
        assertEquals(order, retrievedOrder);
    }
}

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.pragma</groupId>
    <artifactId>ecommerce</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <java.version>21</java.version>
        <spring-boot.version>3.4.0</spring-boot.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>${spring-boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
            <version>${spring-boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <version>${spring-boot.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.1.214</version>
            <scope>runtime</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>${spring-boot.version}</version>
            </plugin>
        </plugins>
    </build>
</project>
```
