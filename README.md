# 🛒 API REST – Gestión de Ventas para Cadena de Supermercados

Este proyecto implementa una **API RESTful** para digitalizar el sistema de control de ventas de una cadena de supermercados usando **Java + Spring Boot**, aplicando buenas prácticas, DTOs, manejo de errores, validaciones y CRUD con JPA.

---

## 🎯 Objetivo del proyecto

La API permite gestionar:

- ✔️ Registrar **productos** con sus respectivos precios.
- ✔️ Administrar **sucursales** donde se venden los productos.
- ✔️ Registrar **ventas** indicando productos y cantidades.
- ✔️ Consultar reportes como (En Progreso):
  - Ventas por sucursal
  - Ingresos totales
  - Productos más vendidos

---

## 🏗️ Tecnologías utilizadas

- Java 17+
- Spring Boot (Web, Validation, Data JPA)
- Hibernate
- MySQL / PostgreSQL
- Lombok
- MapStruct / ModelMapper
- Maven
- SpringDoc OpenAPI (Swagger)

---

## 📐 Arquitectura

Arquitectura en capas:

- **Controller**: exposición de endpoints
- **Service**: reglas de negocio
- **Repository**: persistencia JPA
- **DTOs**: entrada/salida de datos
- **Exception Handler** con `@RestControllerAdvice`
- Relaciones JPA:
  - Producto ↔ VentaItem
  - Sucursal ↔ Venta
  - Venta ↔ VentaItem

---

## 📦 Endpoints principales

### 🛍️ Productos

| Método | Endpoint              | Descripción         |
| ------ | --------------------- | ------------------- |
| POST   | `/api/productos`      | Crear producto      |
| GET    | `/api/productos`      | Listar productos    |
| GET    | `/api/productos/{id}` | Obtener producto    |
| PUT    | `/api/productos/{id}` | Actualizar producto |
| DELETE | `/api/productos/{id}` | Eliminar producto   |

### 🏬 Sucursales

| Método | Endpoint               | Descripción         |
| ------ | ---------------------- | ------------------- |
| POST   | `/api/sucursales`      | Registrar sucursal  |
| GET    | `/api/sucursales`      | Listar sucursales   |
| GET    | `/api/sucursales/{id}` | Obtener sucursal    |
| PUT    | `/api/sucursales/{id}` | Actualizar sucursal |
| DELETE | `/api/sucursales/{id}` | Eliminar sucursal   |

### 💸 Ventas

| Método | Endpoint           | Descripción     |
| ------ | ------------------ | --------------- |
| POST   | `/api/ventas`      | Registrar venta |
| GET    | `/api/ventas`      | Listar ventas   |
| GET    | `/api/ventas/{id}` | Obtener venta   |

### 📊 Reportes

| Método | Endpoint                               | Descripción                  |
| ------ | -------------------------------------- | ---------------------------- |
| GET    | `/api/reportes/ventas-por-sucursal`    | Total de ventas por sucursal |
| GET    | `/api/reportes/productos-mas-vendidos` | Ranking de productos         |
| GET    | `/api/reportes/ingresos-totales`       | Ingresos consolidados        |

---

## ⚙️ Configuración del entorno

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/nombre-del-proyecto.git
cd nombre-del-proyecto

```
