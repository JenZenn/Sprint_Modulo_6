PROYECTO WEB 

PROBLEMA
La empresa carece de un sistema de gestión de información y control de actividades, 
lo que resulta en problemas de coordinación en las visitas, multas por falta de coordinación con clientes, 
y desequilibrios financieros debido a la falta de seguimiento de pagos. 
También se incumplen ciertas actividades de control, lo que afecta la calidad del servicio y la falta de 
registro de actividades preventivas genera incertidumbre sobre los avances.

SOLUCIÓN
Se requiere desarrollar una solución tecnológica integral que mejore la gestión, 
control y seguridad de la información empresarial. Esta solución debe permitir la planificación,
ejecución y gestión de actividades, así como la coordinación con clientes y profesionales para la seguridad.
Además, debe generar informes y estadísticas para la toma de decisiones y garantizar la comunicación incluso 
en áreas sin conectividad a Internet.

DESARROLLO
La empresa de asesorías en prevención de riesgos busca implementar un sistema de información para gestionar sus procesos. 
Se han identificado diversas funcionalidades, como la página de inicio, formulario de contacto, creación y listado de capacitaciones, 
gestión de usuarios, listado de visitas, respuestas a checklist, gestión de pagos.
Se han desarrollado casos de uso iniciales, incluyendo inicio, contacto, creación y listado de capacitaciones, y login, y se requiere 
desarrollar casos adicionales como listado y creación de usuarios, edición de datos de usuarios, listado de visitas, respuesta a checklist, 
listado de pagos y creación de pagos.

TECNOLOGÍAS UTILIZADAS
Frontend: 
HTML
-Boostrap
-Thymeleaf
Backend: 
-Java 17
-Spring Boot 3
-Spring Web
-Spring Security 
-Spring Data JPA
-Spring Boot Dev Tools
-Maven
Bases de Datos: 
-MySQL

ESTRUCTURA DEL PROYECTO
El proyecto se encuentra divididos en los siguientes paquetes:
-Controller
-Model
-Repository
-Service
-Security
-Templates(Vistas)

CONFIGURACIÓN DE SPRING DATASOURCE (application.properties)
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/prevencion_riesgos?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

spring.thymeleaf.cache=false

OTRAS COSIDERACIONES
Para acceder a toda la aplicacion:
-Se debe tener en cuenta que tanto los
nombres de usuarios y contraseñas se encuentran en la 
base datos, asi como los perfiles asociados para acceder a cada una
de las paginas del proyecto.
