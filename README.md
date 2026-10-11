# BiblioTec – API REST de gestión de biblioteca

## 1. Descripción general

BiblioTec sera una API REST desarrollada con Java y Spring Boot que permitira
administrar el catálogo de libros de una biblioteca, a sus usuarios y los
préstamos realizados. Permite dar de alta, consultar, modificar y dar de baja
libros, usuarios y préstamos, y se ejecuta dentro de un contenedor Docker
para garantizar un entorno uniforme.

## 2. Integrantes del equipo

Alvarado Rojas Sirce Yisel
Ceballos Maya César Ricardo
Hernandez Vazquez Karla Daniela

## 3. Requerimientos iniciales

RF1 | CRUD de libros | Alta, consulta, modificación y baja de libros | Prioridad Alta 
RF2 | CRUD de usuarios | Alta, consulta, modificación y baja de usuarios |Prioridad Alta 
RF3 | Registro de préstamos | Crear un préstamo asociando un libro y un usuario | Prioridad Alta 
RF4 | Devolución de libros | Marcar un préstamo como devuelto y actualizar el inventario | Prioridad Media 
RF5 | Consultas filtradas | Buscar libros por título, autor o categoría y listar préstamos por usuario | Prioridad Media 

## 4. Funcionalidades que Spring Boot puede resolver con sus paquetes


 Exposición de endpoints REST - spring-boot-starter-web 
 Conexión a base de datos y ORM - spring-boot-starter-data-jpa (+ H2 o PostgreSQL) 
 Validación de datos de entrada - spring-boot-starter-validation 
 Autenticación y autorización - spring-boot-starter-security 
 Logs y monitoreo - Logging de Spring Boot (SLF4J/Logback) y spring-boot-starter-actuator 
 Documentación de la API - springdoc-openapi (Swagger UI) 
 Manejo global de errores - @ControllerAdvice / @ExceptionHandler 
 Pruebas - spring-boot-starter-test 

## Cómo ejecutar
1. Abrir el repositorio en VS Code con la extensión *Dev Containers*.
2. Seleccionar "Reopen in Container".
3. Ejecutar `./mvnw spring-boot:run`.
4. Visitar `http://localhost:8080/hello`.