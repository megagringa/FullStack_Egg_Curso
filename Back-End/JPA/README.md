# JPA

En esta guía aprenderemos:
- Qué es JPA y cómo funciona.
- Mapear entidades y atributos.
- Mapear relaciones entre clases.
- Persistir, buscar, modificar y eliminar entidades de la
base de datos desde Java
- Crear consultas a la base de datos desde Java

JPA (Java Persistence API) es la propuesta estándar que ofrece Java para implementar un
Framework Object Relational Mapping (ORM), que permite interactuar con la base de datos por
medio de objetos, de esta forma. JPA es el encargado de convertir los objetos Java en
instrucciones para el Manejador de Base de Datos (DBMS). El objetivo que persigue el diseño de
esta API es no perder las ventajas de la orientación a objetos al interactuar con una base de datos
(siguiendo el patrón de mapeo objeto-relacional).

Cuando empezamos a trabajar con bases de datos en Java utilizamos el API de JDBC el cual nos
permite realizar consultas directas a la base de datos a través de consultas SQL nativas. JDBC por
mucho tiempo fue la única forma de interactuar con las bases de datos, pero representaba un
gran problema y es que Java es un lenguaje orientado a objetos y se tenían que convertir los
atributos de las clases en una consulta SQL como SELECT, INSERT, UPDATE, DELETE, etc. Lo que
ocasionaba un gran esfuerzo de trabajo y provocaba muchos errores en tiempo de ejecución,
debido principalmente a que las consultas SQL se tenían que generar frecuentemente al vuelo.

JPA es una especificación, es decir, no es más que un documento en el cual se plasman las reglas
que debe de cumplir cualquier proveedor que desee desarrollar una implementación de JPA, de
tal forma que cualquier persona puede tomar la especificación y desarrollar su propia
implementación de JPA. Existen varios proveedores como lo son los siguientes:
- Hibernate
- ObjectDB
- EclipseLink
- OpenJPA

---
---


---
---


---
---