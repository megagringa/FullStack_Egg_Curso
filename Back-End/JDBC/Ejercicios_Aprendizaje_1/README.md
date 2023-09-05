1. Tienda
Nos han pedido que hagamos una aplicación Java para una tienda con sus productos. El
objetivo es realizar consultas para saber el stock de ciertos productos o que productos hay,
etc. Utilizando el lenguaje JAVA, una base de datos MySQL y JDBC para realizar la ejecución
de operaciones sobre la base de datos (BD).
Para este ejercicio vamos a usar el script de la base de datos llamada “tienda.sql” que lo
trabajamos en la guía de MySql, igualmente lo van a encontrar dentro del archivo
persistencia.zip. Deberá obtener un diagrama de entidad relación igual al que se muestra a
continuación:
Paquetes del Proyecto Java
Crear un nuevo proyecto en Netbeans del tipo “Java Application” con el nombre Tienda y
agregar dentro 3 paquetes, a uno se lo llamará entidades, al otro se le llamará servicios y al
otro persistencia:
13
Para crear los paquetes de esta manera, se deben crear desde el paquete principal, sería nos
paramos en el paquete tienda -> Click derecho -> New Java Package y creamos los paquetes.
También es importante agregar en “Libraries” la librería “MySQL JDBC Driver” para permitir
conectar la aplicación de Java con la base de datos MySQL. Esto se explica en el Instructivo
que ya leíste al final de esta guía.
Paquete persistencia
En este paquete estará la clase DAO encarga de conectarse con la base de datos y de
comunicarse con la base de datos para obtener sus datos. Además, estará las clases de
EntidadDaoExt para cada entidad / tabla de nuestro proyecto.
Es importante tener la conexión creada a la base de datos, como lo explica el Instructivo en la
pestaña de Services en Netbeans.
Paquete entidades:
Dentro de este paquete se deben crear todas las clases necesarias que vamos a usar de la
base de datos. Por ejemplo, una de las clases a crear dentro de este paquete es la clase
“Producto.java” con los siguientes atributos:
• private int codigo;
• private String nombre;
• private double precio;
• private int codigoFabricante;
Agregar a cada clase el/los constructores necesarios y los métodos públicos getters y setters
para poder acceder a los atributos privados de la clase. La llave foránea se pondrá como dato
nada más, no como objeto.
Paquete servicios:
En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. En
general se crea un servicio para administrar cada una de las entidades y algunos servicios
para manejar operaciones muy específicas como las estadísticas.
Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
 a) Lista el nombre de todos los productos que hay en la tabla producto.

 b) Lista los nombres y los precios de todos los productos de la tabla producto.

 c) Listar aquellos productos que su precio esté entre 120 y 202.

 d) Buscar y listar todos los Portátiles de la tabla producto.

 e) Listar el nombre y el precio del producto más barato.

 f) Ingresar un producto a la base de datos.

 g) Ingresar un fabricante a la base de datos

 h) Editar un producto con datos a elección.


---

1. Creación de paquetes:

En NetBeans, crea un nuevo proyecto Java Application llamado "Tienda".
Crea tres paquetes dentro del proyecto: entidades, servicios, y persistencia.

2. Configuración de la base de datos:
Asegúrate de tener una base de datos MySQL configurada y ejecuta el script "tienda.sql" para crear las tablas necesarias.

3. Paquete persistencia:
En este paquete, crea una clase llamada ConexionBD para gestionar la conexión a la base de datos utilizando JDBC.
Crea una clase DAO (Data Access Object) para cada entidad de la base de datos (por ejemplo, ProductoDAO y FabricanteDAO). Estas clases serán responsables de interactuar con la base de datos y ejecutar consultas.
Implementa métodos en las clases DAO para realizar operaciones como inserción, actualización, eliminación y consulta de registros en la base de datos.

4. Paquete entidades:
Crea clases Java que representen las entidades de la base de datos (por ejemplo, Producto y Fabricante) con atributos que coincidan con las columnas de las tablas.
Agrega constructores y métodos getters y setters para acceder a los atributos de las clases.

5. Paquete servicios:
Crea una clase llamada TiendaService que contendrá los métodos para realizar las operaciones requeridas en la aplicación.

6. Menú de la aplicación:
Implementa un menú en Java que permita al usuario elegir qué consulta o operación desea realizar.
Para cada opción del menú, llama a los métodos correspondientes en TiendaService que a su vez interactuarán con las clases DAO para acceder a la base de datos.

1. Clase ConexionBD en el paquete persistencia:

java
Copy code
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/tienda";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

2. Clase Producto en el paquete entidades:

java
Copy code
package entidades;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int codigoFabricante;

    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    // Getters y setters
}

3. Clase ProductoDAO en el paquete persistencia:

java
Copy code
package persistencia;

import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private final Connection conexion;

    public ProductoDAO() {
        conexion = ConexionBD.conectar();
    }

    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
        String consulta = "SELECT * FROM producto";

        try (PreparedStatement ps = conexion.prepareStatement(consulta);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int codigoFabricante = rs.getInt("codigo_fabricante");
                productos.add(new Producto(codigo, nombre, precio, codigoFabricante));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }

    // Implementa otros métodos para operaciones adicionales
}

4. Clase TiendaService en el paquete servicios:

java
Copy code
package servicios;

import entidades.Producto;
import java.util.List;
import persistencia.ProductoDAO;

public class TiendaService {

    private final ProductoDAO productoDAO;

    public TiendaService() {
        productoDAO = new ProductoDAO();
    }

    public List<Producto> listarProductos() {
        return productoDAO.listarProductos();
    }

  
}



 ---
 ---
La guia de instalacion de JDBC: [Clic aquí](https://github.com/megagringa/FullStack_Egg_Curso/blob/main/Guia/Instructivo_JDBC.pdf)

JDBC: [Clic aquí](https://github.com/megagringa/FullStack_Egg_Curso/blob/main/Guia/JDBC.pdf)

 ---
 ---

 Volver al principio del repositorio. [FullSTack_Egg](https://github.com/megagringa/FullStack_Egg_Curso)