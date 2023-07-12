# INTEGRADOR BASE DE DATOS
Llegó el momento de poner a prueba nuestros conocimientos de bases de datos, para ello nos
han propuesto el siguiente desafío:
Tenemos que adivinar la clave y posición de una caja fuerte. El cerrojo consta de 4 candados,
cada candado tiene de clave, un número que puede ser de más de 1 cifra y una posición que
puede ir desde 1 a 4.
Nosotros tenemos los 4 candados en la mano (Candado A, Candado B, Candado C y Candado D)
debemos averiguar la posición de cada candado y la clave del mismo.

---
Descargar el contenido en la carpeta 
[Base de Datos](https://github.com/megagringa/FullStack_Egg_Curso/blob/main/Guia/Integrador-Mysql.pdf)

---
Volver al principio del repositorio. [FullSTack_Egg](https://github.com/megagringa/FullStack_Egg_Curso)

---
---

1) CANDADO A
- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/ siguiente/s consulta/s:
- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
---

- SELECT COUNT(*) 
- FROM estadisticas e
- GROUP BY e.Asistencias_por_partido
- ORDER BY e.Asistencias_por_partido desc
- LIMIT 1;

-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) "2"

---

- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos:
- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones. "!14043"

---
- SELECT SUM(j.peso)
- FROM jugadores j
- JOIN equipos e on e.Nombre = j.Nombre_equipo
- e.Conferencia like 'east' and j.Posicion 
- LIKE '%c%';

---
---

2) CANDADO B
- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat. 

---
- SELECT COUNT(Nombre) 
- FROM jugadores j
- JOIN estadisticas e on e.jugador = j.codigo
- WHERE e.Asistencias_por_partido >= all (
	- SELECT COUNT(*) 
    - FROM jugadores j
	- WHERE j.Nombre_equipo = 'Heat'
    group by j.Nombre_equipo);

-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) "3"

---
- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999. "3480"

---
- SELECT COUNT(temporada) 
- FROM partidos
- WHERE temporada like '%99%';

---
---

3) CANDADO C
- El candado C está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
- Este resultado nos dará la posición del candado (1, 2, 3 o 4) "1"

---
- SELECT COUNT(*)/(
	- SELECT COUNT(*)
    - FROM jugadores ju
    - WHERE ju.Peso >= 195
) + 0.9945 
    - FROM jugadores j
    - JOIN equipos e on e.Nombre = j.Nombre_equipo
    - WHERE j.Procedencia = 'Michigan' and e.Conferencia = 'west';

---
- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos: "1038"
- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar:
-  el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
- tapones por partido. Además, este resultado debe ser, donde la división sea central. 

---
- SELECT floor(avg(est.Puntos_por_partido)+count(est.asistencias_por_partido)+sum(est.tapones_por_partido)) 
FROM estadisticas est
- JOIN jugadores j on est.jugador=j.codigo
- JOIN equipos eq on j.Nombre_equipo=eq.Nombre
- WHERE eq.Division='Central';

---
---

4) CANDADO D
- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01.
-  Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado.

---
- SELECT ROUND(e.tapones_por_partido)
- FROM estadisticas e
- JOIN jugadores j on j.codigo = e.jugador
- WHERE e.temporada = '00/01' and j.Nombre = 'Corey Maggette';

-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) "4"

---

- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de datos: "191"
- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
- de todos los jugadores de procedencia argentina.

---
- SELECT floor(sum(Puntos_por_partido))  
- FROM estadisticas e
- JOIN jugadores j on e.jugador=j.codigo
- WHERE Procedencia='Argentina';

---
---
---

# Preguntero

## Java Introducción


1) - Qué hace el siguiente código? *
    ```
     - int aux = 0;
     - aux ++;
    ```
   incrementa en 1 la variable aux

---

2) - Tipos de datos en Java: *

    byte, short, int, long, float, double, boolean, char, String.

---

3) - Cual de los siguientes métodos NO es parte de la clase String?
    
    .stringLength()

---

4) - Las variables siempre deben especificar de qué tipo son al ser
declaradas.

    Verdadero

---

5) - Cuál es la salida del siguiente código? *
    ```
     - int num1 = 6;
     - int num2 = 8;
     - System.out.println(num1==num2);
    ```
    False

---

6) - El método main puede estar o no en un proyecto Java
funcional.

    Falso

---

## POO


7) - Qué es un constructor? *

    Es un método que nos permite instanciar un objeto de la clase donde se encuentra

---

8) - Cuáles son los modificadores de acceso? *

    Public, private, protected

---

9) - Cuál es la diferencia entre clases y objetos? *

    Las clases son “moldes” y los objetos son modelados a partir de esos moldes,
también llamados “instancias”

---

10) - Cómo accedo a los atributos de un objeto? *

    Con el símbolo . luego del nombre del objeto

---

11) - Qué es el encapsulamiento? *

    Hace referencia a crear métodos para obtener y modificar información de un
objeto, manteniendo oculto lo que hace un objeto por dentro

---

12) - Qué son los atributos? *

    Variables que guardan información sobre el objeto

---

13) - ¿De que se encarga Clase servicio o control? *

    Se encarga de crear y modificar objetos, teniendo cada clase de entidad una clase
control.

---

14) - Cuál es la salida de este código? *
    ```
      - Persona p1 = new Persona();
      - Perosna p2 = new Persona();

      - p1.setNombre("Albus Dumbledore");
      - p2.setNombre(p1.getNombre());

      - System.out.println(p1.equals(p2)); 
      - System.out.println(p1.getNombre().equals(p2.getNombre()));
    ```
      False, True

---

15) - Cuál de estos servicios trabaja de la manera correcta? *
    ```
    - public void conocerNombre(Persona x){
        System.out.println("La persona se llama " + x.getNombre());
    } 

    public void conocerNombre(String nombre){
        System.out.println("La persona se llama " + nombre);
    }
    ```
    El que obtiene el nombre a través de un objeto Persona

---

16) - Qué significa POO? *

    Programación Orientada a Objetos

---

16) - Qué hace el siguiente código? *

    ```
    Persona p1 = new Persona();

    ```
    Instancia un objeto de tipo Persona llamado p1

---

17) - Cómo se define el tamaño de una colección? *

    Las colecciones son dinámicas, su tamaño depende de la cantidad de objetos que
le agreguemos o quitemos

---

18) - Qué puede almacenar una colección? *

    Objetos de la misma clase

---

19) - El Java Collection Framework es: *

    Un conjunto de clases e interfac

---

20) - Los mapas son colecciones de Llave/Valor. Las llaves son
únicas pero los valores sí pueden repetirse.

    Verdadero

---

21) - Cuál de las siguientes herramientas nos facilita recorrer una
lista?

    Bucle ForEach

---

22) - Los conjuntos o Sets pueden contener elementos repetidos,
simplemente se duplica el valor

    Falso

---

23) - Un framework es un marco de trabajo el cual contiene un
conjunto estandarizado de conceptos, prácticas y criterios
para hacer frente a un tipo de problemática particular y
resolver nuevos problemas de índole similar.

    Verdadero

---

24) - Las listas son colecciones de objetos ordenados por posición
donde los elementos pueden repetirse.


    Veradadero

---    

## Relaciones entre Clases

25) - Las relaciones pueden ser *

    Uno a Uno, Cero a Uno, Uno a Muchos y Cero a Muchos

---

26) - La composición es un tipo de relación donde un objeto
complejo es conformado por objetos más pequeños.

    Verdadero

---

27) - Las clases no actúan aisladas entre sí, al contrario, las clases
están relacionadas unas con otras

    Verdadero

---

28) - En una relación de agregación, un objeto depende del otro,
no pueden existir individualmente

    Falso

---

29) - Las relaciones son siempre unidireccionales *

    Falso


---

30) - Las relaciones entre clases realmente significan que una clase
contiene una referencia a un objeto u objetos, de la otra clase
en la forma de un atributo

    Verdadero

---

## Herencia

31) - Qué es la Super Clase? *

    Como se llama a la clase superior(Padre o Madre)

---

32) - Para qué sirve el modificador Protected? *

    Para que los atributos sean accesibles sólo por las clases que heredan sin usar
getters ni setters

---

33) - La Sub Clase hereda el constructor *

    Falso

---

34) - Una clase hija puede heredar de muchas clases padres. *

    Falso

---

35) - La Sub Clase hereda atributos y métodos. *

    Verdadero

---

36) - Qué hace la anotación @Override? *

    Permite que la clase hija haga funcionar un método de manera diferente a la clase
padre

---

37) - En el siguiente código ¿cuál es la clase padre? *

    ```
    public class Persona extends serVivo{
        String nombre;
    }

    ```
    SerVivo

---

38) - Cuándo usamos la palabra reservada super? *

    Cuando queremos acceder a los métodos, atributos y constructores de la clase
superior

---

39) - Una clase padre puede heredar a muchas clases hijas. *

    Verdadero

---

## Manejo de Excepciones

40) - Sólo se puede usar 1 bloque catch por bloque try. *

    Falso

---

41) - Cuál es el resultado del siguiente código? siguiendo el
ejemplo que venimos viendo

    ```
    Persona p1 = new Persona();
    String nombre = null;

    try{
        if(!nombre.equals(null)){
            p1.setNombre(nombre);
        }
    }catch(Excepcion e){
        System.out.println("El nombre no puede ser nulo");
    }

    ```
    Se imprime por consola "El nombre no puede ser nulo"

---

42) - Cuando se lanza una excepción no hay nada más que hacer,
termina el programa.

    Falso

---

43) - Para aclarar que un método puede lanzar un error se coloca la
palabra “extends”.

    Falso

---

44) - Una excepción es un evento que ocurre durante la ejecución
de un programa que interrumpe el flujo normal de las
instrucciones del programa.

    Verdadero

---

45) - Si una excepción se produce en el bloque catch, puede
atraparse en el bloque try y manejarla.

    Falso

---

46) - Un objeto Exception contiene información sobre un error
ocurrido.

    Verdadero

---

## MySQL

47) - Candado C *

    Clave: 631

---

48) - Candado A *

    Posición 2

---

49) - Candado A *

    Clave: 14043

---

50) - Candado B *

    Posición 3

---

51) - Candado D *

    Posición 4

---

52) - Candado D *

    Clave: 191

---

53) - Candado B *

    Clave: 3480

---

54) - Candado C *

    Posición 1

---
---
---    