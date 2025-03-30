# Proyecto-Spring-Boot
Claro, aquí tienes un ejemplo de un archivo `README.md` que puedes utilizar para tu proyecto de **Spring Boot** para la gestión de estudiantes:

# Proyecto de Gestión de Estudiantes - Spring Boot

Este proyecto es una API RESTful construida con **Spring Boot**. Su objetivo es proporcionar una plataforma para gestionar estudiantes en una universidad, permitiendo realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los registros de estudiantes.

## Funcionalidades

- Crear Estudiante: Permite agregar un nuevo estudiante a la base de datos.
- Obtener Estudiantes: Permite obtener la lista de estudiantes o un estudiante por su ID.
- Actualizar Estudiane: Permite modificar la información de un estudiante existente.
- Eliminar Estudiante: Permite eliminar un estudiante de la base de datos.

## Tecnologías utilizadas

- Spring Boot: Framework para la construcción de aplicaciones Java basadas en microservicios.
- JPA (Java Persistence API)**: Utilizado para la persistencia de los datos en PostgreSQL.
- Lombok: Biblioteca que reduce el código repetitivo (como getters, setters, constructores).
- DTO (Data Transfer Object)**: Usado para transferir datos entre las capas de la aplicación.
- Maven: Herramienta para la gestión de dependencias y construcción del proyecto.

## Requisitos previos

Para ejecutar este proyecto en tu máquina local, necesitas:

- Java 17 o superior** (recomendado).
- Maven: Para gestionar las dependencias y la construcción del proyecto.
- IDE (como IntelliJ IDEA o Eclipse)**: Para desarrollar y ejecutar el proyecto.

## Configuración

### 1. Clonar el repositorio

```bash
git clone https://github.com/Amilcar06/Proyecto-Spring-Boot.git
cd Proyecto-Spring-Boot
```

### 2. Ejecutar la aplicación

- Abre tu terminal, navega a la carpeta del proyecto y ejecuta el siguiente comando:

```bash
mvn spring-boot:run
```

Esto iniciará el servidor en el puerto **8080**.

### 3. Acceder a la API

Una vez que la aplicación esté ejecutándose, podrás hacer solicitudes HTTP a la API:

- **POST** `/estudiantes` para crear un estudiante.
- **GET** `/estudiantes/id` para obtener un estudiante por ID.
- **GET** `/estudiantes` para obtener la lista de estudiantes.
- **PUT** `/estudiantes/id` para actualizar la información de un estudiante.
- **DELETE** `/estudiantes/id` para eliminar un estudiante.

Puedes probar estas solicitudes utilizando herramientas como **Postman** o **cURL**.

Si tienes más preguntas o necesitas ayuda, no dudes en abrir un **issue** en el repositorio.
