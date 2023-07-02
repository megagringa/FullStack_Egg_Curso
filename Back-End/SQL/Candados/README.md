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