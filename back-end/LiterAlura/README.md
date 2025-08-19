# 📚 Gutendex Spring Boot API

Este proyecto es un **servicio REST en Java con Spring Boot** que consume la [API de Gutendex](https://gutendex.com/) (catálogo de libros de *Project Gutenberg*) y permite realizar búsquedas y filtros avanzados de libros y autores usando:

- `HttpClient`, `HttpRequest`, `HttpResponse` de Java 11+
- **Streams y lambdas** para filtrado en memoria
- **Spring Data JPA** con *derived queries* para búsquedas en base de datos

---

## 🚀 Funcionalidades

1. **Buscar libros por título**  
   Endpoint: `/api/books/title?title=...`

2. **Buscar libros por autor**  
   Endpoint: `/api/books/author?author=...`

3. **Buscar libros por ID** (con persistencia en BD)  
   Endpoint: `/api/books/{id}`  
   - Si el libro no existe en la base de datos, se consulta en Gutendex y se guarda.

4. **Obtener los 10 primeros libros por idioma**  
   Endpoint: `/api/books/top10?language=es`

5. **Listar autores vivos en determinado año**  
   Endpoint: `/api/authors/alive?year=1850`

---

## 🛠 Tecnologías usadas

- Java 17+  
- Spring Boot 3.x  
- Spring Web (REST API)  
- Spring Data JPA + H2 (base de datos en memoria, configurable a MySQL/PostgreSQL)  
- Jackson (para parsear JSON)  
- Gutendex API  

---

## 📦 Instalación y ejecución

### 1. Clonar repositorio
```bash
git clone https://github.com/tu-usuario/gutendex-springboot.git
cd gutendex-springboot
