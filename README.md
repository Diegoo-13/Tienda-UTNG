# 🛒 Tienda UTNG

Proyecto desarrollado para la asignatura de **Programación Orientada a Objetos** de la **Universidad Tecnológica del Norte de Guanajuato (UTNG)**.

## Badges

![Java](https://img.shields.io/badge/Java-26-blue)
![SQL Server](https://img.shields.io/badge/SQL%20Server-JDBC-red)
![Git](https://img.shields.io/badge/Git-Version%20Control-orange)
![GitHub](https://img.shields.io/badge/GitHub-Repositorio-black)

---

## Descripción

Este proyecto implementa un sistema básico de gestión de productos utilizando:

- Java
- JDBC
- SQL Server
- Git y GitHub

El sistema permite realizar operaciones CRUD (Crear, Consultar, Actualizar y Eliminar) sobre una tabla de productos.

---

## Estructura del proyecto

```
src/
│
├── ConexionDB.java
├── Producto.java
├── ProductoDAO.java
├── ProductoDAOImpl.java
├── ProductoService.java
└── Main.java
```

---

## Base de datos

Base de datos:

```
tienda_utng
```

Tabla utilizada:

```
Producto
```

Campos:

- Id
- Nombre
- Precio
- Stock

---

## Funcionalidades

- Agregar productos
- Buscar productos por ID
- Listar productos
- Actualizar productos
- Eliminar productos

---

## Requisitos

- Java JDK 26
- SQL Server
- Driver JDBC para SQL Server
- Visual Studio Code

---

## Ejecución

1. Clonar el repositorio.

```bash
git clone URL_DEL_REPOSITORIO
```

2. Abrir el proyecto en Visual Studio Code.

3. Configurar la conexión a SQL Server en `ConexionDB.java`.

4. Ejecutar `Main.java`.

---

## Autor

**Juan Diego Aguilar Bautista**

Universidad Tecnológica del Norte de Guanajuato