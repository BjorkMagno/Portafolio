# 📚 ForoHub API

ForoHub es una API REST construida con **Java 17**, **Spring Boot 3**, **Maven**, **MySQL 8** y **JWT** para autenticación.  
Permite crear, listar, actualizar y eliminar tópicos en un foro, con control de acceso mediante tokens de autenticación.

---

## ⚙️ Requisitos previos

Asegúrate de tener instalado en tu entorno:

- [Java JDK 17+](https://adoptium.net/)  
- [Maven 4+](https://maven.apache.org/download.cgi)  
- [MySQL 8+](https://dev.mysql.com/downloads/installer/)  
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (opcional)

---

# 📚 ForoHub API – Descripción del código

Este proyecto es una **API REST** desarrollada en **Java 17 con Spring Boot 3**, que implementa un foro llamado **ForoHub**.  
El objetivo del código es permitir la gestión de **tópicos de discusión** en un foro, asegurando que solo los usuarios autenticados puedan interactuar con la aplicación mediante **autenticación con JWT**.

---

## 🧩 ¿Qué implementa el código?

### 1. Gestión de tópicos
El código permite realizar operaciones **CRUD** sobre los tópicos de un foro:
- **Crear un tópico** → `POST /topicos`
- **Listar todos los tópicos** → `GET /topicos`
- **Obtener el detalle de un tópico** → `GET /topicos/{id}`
- **Actualizar un tópico existente** → `PUT /topicos/{id}`
- **Eliminar un tópico** → `DELETE /topicos/{id}`

Cada **tópico** tiene la siguiente información:
- `id` (identificador único)  
- `titulo`  
- `mensaje`  
- `fecha_creacion`  
- `estado` (ABIERTO o CERRADO)  
- `autor` (usuario que lo creó)  
- `curso` (curso al que pertenece el tópico)  

---

### 2. Autenticación con JWT
El código también implementa un **mecanismo de seguridad** para proteger la API:
- Los usuarios deben **iniciar sesión** en `/auth/login` enviando su **email y contraseña**.  
- Si las credenciales son correctas, se genera un **token JWT**.  
- Ese token debe enviarse en cada petición a la API dentro del encabezado `Authorization: Bearer <token>`.  
- Solo los usuarios autenticados pueden crear, ver, actualizar o eliminar tópicos.  

---

### 3. Estructura del proyecto
El código está organizado en capas dentro de paquetes:

- **entity/** → contiene las entidades que representan las tablas de la base de datos (`Topico`, `Autor`, `Curso`, `Usuario`).
- **repository/** → contiene las interfaces que permiten acceder a la base de datos mediante Spring Data JPA.
- **service/** → contiene la lógica de negocio, por ejemplo la creación o actualización de un tópico.
- **controller/** → contiene los controladores REST que definen los endpoints de la API (`TopicoController`, `AuthController`).
- **security/** → contiene la configuración de seguridad con Spring Security, el filtro JWT y la utilidad para generar/validar tokens.

---

### 4. Tecnologías usadas en el código
- **Spring Boot** → para crear la API REST.  
- **Spring Data JPA** → para interactuar con la base de datos MySQL.  
- **Spring Security** → para asegurar la aplicación.  
- **JWT (JSON Web Token)** → para autenticar a los usuarios.  
- **MySQL** → como base de datos.  

---

## 🎯 Resumen
En conclusión, el código implementa una **API de foro** donde los usuarios autenticados pueden:
- Publicar nuevos tópicos.  
- Consultar los tópicos existentes.  
- Ver detalles de un tópico específico.  
- Modificar o eliminar tópicos.  

La seguridad está garantizada mediante **tokens JWT**, lo que asegura que solo los usuarios con sesión iniciada puedan interactuar con la API.


