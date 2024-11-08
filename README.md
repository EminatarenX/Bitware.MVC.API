# Bitware Application

Este proyecto utiliza Docker para ejecutar una aplicación Java junto con un contenedor de base de datos PostgreSQL.

## Requisitos Previos

Asegúrate de tener instalado lo siguiente en tu máquina:

- [Docker](https://docs.docker.com/get-docker/)
- [Docker Compose](https://docs.docker.com/compose/install/)

## Estructura del Proyecto

Este proyecto incluye un servicio de base de datos PostgreSQL configurado con Docker Compose. El contenedor se configura con las siguientes credenciales:

- **Base de datos:** `bitwaredb`
- **Usuario:** `postgres`
- **Contraseña:** `bitware123`

## Configuración del Proyecto


Instala las dependencias de Java:

Asegúrate de que tu proyecto Java tenga un archivo de configuración (por ejemplo, pom.xml para Maven o build.gradle para Gradle) que incluya las dependencias necesarias. Puedes instalar las dependencias con:

Para Maven:
`mvn install`


Ejecución del Contenedor de la Base de Datos
Para iniciar el contenedor de PostgreSQL, ejecuta el siguiente comando en la raíz del proyecto donde se encuentra tu archivo docker-compose.yml:


docker-compose up db
Esto levantará el contenedor de la base de datos. Puedes acceder a la base de datos en localhost:5432 usando las credenciales especificadas.

Ejecutar la Aplicación Java
Una vez que el contenedor de la base de datos esté en funcionamiento, puedes ejecutar tu aplicación Java. La aplicación se ejecuta en el puerto 4000 y puedes acceder a la API de usuarios en la siguiente URL:


http://localhost:4000/api/usuarios
Endpoints de la API
La API de usuarios incluye los siguientes endpoints:

```bash
GET /api/usuarios: Obtiene una lista de todos los usuarios.
POST /api/usuarios: Crea un nuevo usuario.
PATCH /api/usuarios/:id: Actualiza un usuario existente por su ID.
DELETE /api/usuarios/:id: Elimina un usuario existente por su ID.
GET /api/usuarios/:id: Obtiene un usuario específico por su ID.
Dependiendo de tu configuración, esto puede hacerse de diferentes maneras:
```

docker-compose down

