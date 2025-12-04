🛒 API REST – Gestión de Ventas para Cadena de Supermercados

Este proyecto implementa una API RESTful completa para digitalizar el sistema de control de ventas de una cadena de supermercados.
La solución está desarrollada con Java + Spring Boot, aplicando buenas prácticas de arquitectura, DTOs, validaciones, manejo de errores, relaciones entre entidades y operaciones CRUD basadas en JPA.

🎯 Objetivo del proyecto

Construir una API REST que permita gestionar:

✔️ Productos con sus respectivos precios.

✔️ Sucursales donde se venden los productos.

✔️ Ventas realizadas en cada sucursal, detallando productos y cantidades.

✔️ Consultas posteriores como:

Ventas por sucursal

Totalización de ingresos

Productos más vendidos

Filtros y reportes básicos

🏗️ Tecnologías utilizadas

Java 17+

Spring Boot (Web, Validation, Data JPA)

Hibernate

MySQL / PostgreSQL (configurable)

Lombok

ModelMapper / MapStruct para DTOs

Maven

Swagger / SpringDoc OpenAPI para documentación interactiva

📐 Arquitectura y Diseño

El proyecto está diseñado aplicando:

Arquitectura en capas: Controller → Service → Repository

DTOs para entrada y salida de datos

Validaciones con jakarta.validation

Manejo global de excepciones (@RestControllerAdvice)

Uso de Streams y Lambdas donde aplica

Relaciones JPA:

Producto ↔ VentaItem (OneToMany)

Sucursal ↔ Venta (OneToMany)

Venta ↔ VentaItem (OneToMany)

📦 Endpoints principales
🛍️ Productos
Método Endpoint Descripción
POST /api/productos Crear un producto con su precio
GET /api/productos Listar productos
GET /api/productos/{id} Obtener producto
PUT /api/productos/{id} Actualizar
DELETE /api/productos/{id} Eliminar
🏬 Sucursales
Método Endpoint Descripción
POST /api/sucursales Registrar una sucursal
GET /api/sucursales Listar
GET /api/sucursales/{id} Obtener detalles
PUT /api/sucursales/{id} Actualizar
DELETE /api/sucursales/{id} Eliminar
💸 Ventas
Método Endpoint Descripción
POST /api/ventas Registrar una venta
GET /api/ventas Listar ventas
GET /api/ventas/{id} Obtener venta
📊 Reportes
Método Endpoint Descripción
GET /api/reportes/ventas-por-sucursal Total por sucursal
GET /api/reportes/productos-mas-vendidos Ranking de productos
GET /api/reportes/ingresos-totales Ingresos globales
⚙️ Configuración del entorno
1️⃣ Clonar el repositorio
git clone <https://github.com/tu-usuario/nombre-del-proyecto.git>
cd nombre-del-proyecto

2️⃣ Configurar base de datos

En application.properties o application.yml:

spring.datasource.url=jdbc:mysql://localhost:3306/supermercado
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update

3️⃣ Ejecutar la aplicación
mvn spring-boot:run

4️⃣ Documentación Swagger

Una vez levantado el proyecto:

👉 <http://localhost:8080/swagger-ui/index.html>

🧪 Tests

Incluye pruebas unitarias y de servicio usando:

JUnit 5

Mockito

Para ejecutarlas:

mvn test

📁 Estructura del proyecto
src/
├── main/java/com/empresa/supermercado
│ ├── controller/
│ ├── service/
│ ├── repository/
│ ├── dto/
│ ├── entity/
│ └── exception/
└── test/java/...

🚀 Futuras mejoras

Autenticación y autorización (JWT)

Paginación y ordenamiento avanzados

Reportes estadísticos con filtros

Dockerización del proyecto
