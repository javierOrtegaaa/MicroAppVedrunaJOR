# Aplicación Backend Basada en Microservicios

## Descripción
Esta aplicación backend está diseñada siguiendo una arquitectura de microservicios. Consta de los siguientes componentes:

- `ComentariosController.java`
- `IncidenciasController.java`
- `PublicacionesController.java`
- `UsuarioController.java`

Además, se ha implementado una funcionalidad adicional que permite enviar un correo electrónico cuando se registra una nueva incidencia.

## Características
- **Arquitectura de Microservicios**: La aplicación está diseñada siguiendo el patrón de microservicios, lo que permite una mayor escalabilidad, flexibilidad y mantenibilidad.
- **Envío de Correo Electrónico**: Cuando se registra una nueva incidencia, se envía automáticamente un correo electrónico al equipo correspondiente.
- **Controladores REST**: Los diferentes componentes de la aplicación exponen sus funcionalidades a través de controladores REST.
- **Tecnologías Utilizadas**: Java, Spring Boot, Microservicios, Servicio de Correo Electrónico.

## Instalación y Despliegue
1. Clona el repositorio del proyecto:
   ```bash
   git clone [https://github.com/tu-repo.git](https://github.com/javierOrtegaaa/MicroAppVedrunaJOR.git)
   ```
2. Configura las variables de entorno necesarias, como la conexión a la base de datos y la configuración del servicio de correo electrónico.
3. Construye y empaqueta la aplicación utilizando Maven:
   ```bash
   mvn clean install
   ```
4. Despliega los diferentes microservicios en un entorno de producción, como un clúster de Kubernetes o un servicio de hosting de aplicaciones.

## Contribución
Si deseas contribuir al proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu característica o corrección de errores.
3. Realiza tus cambios y haz un commit.
4. Envía un pull request.

## Licencia
Este proyecto se distribuye bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

## Contacto
Para más información o soporte, puedes contactar a [javier.ortega@a.vedrunasevillasj.es].
