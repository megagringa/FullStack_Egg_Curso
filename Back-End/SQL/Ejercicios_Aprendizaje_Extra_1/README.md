Estos van a ser ejercicios para reforzar los conocimientos previamente vistos. Estos pueden
realizarse cuando hayas terminado la guía y tengas una buena base sobre lo que venimos
trabajando. Además, si ya terminaste la guía y te queda tiempo libre en las mesas, podes continuar
con estos ejercicios extra, recordando siempre que no es necesario que los termines para
continuar con el tema siguiente. Por último, recordá que la prioridad es ayudar a los compañeros
de la mesa y que cuando tengas que ayudar, lo más valioso es que puedas explicar el ejercicio
con la intención de que tu compañero lo comprenda, y no sólo mostrarlo. ¡Muchas gracias!
1. Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
obtener un diagrama de entidad relación igual al que se muestra a continuación:

---
Descargar el contenido en la carpeta 
[Base de Datos](https://github.com/megagringa/FullStack_Egg_Curso/tree/main/BD-Descargas)


---

A continuación, se deben realizar las siguientes consultas sobre la base de datos:
1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
- SELECT Nombre
- FROM Jugadores
- ORDER BY Nombre ASC;

---
2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.
- SELECT Nombre
- FROM Jugadores
- WHERE Posicion = 'C' AND Peso > 200
- ORDER BY Nombre ASC;

---
3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
- SELECT nombre
- FROM equipos
- ORDER BY nombre ASC;

---
4. Mostrar el nombre de los equipos del este (East).
- SELECT nombre
- FROM equipos
- WHERE conferencia = 'East'
- ORDER BY nombre ASC;

---
5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
- SELECT nombre
- FROM equipos
- WHERE ciudad LIKE 'C%'
- ORDER BY nombre ASC;

---
6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
- SELECT nombre, nombre_equipo 
- FROM jugadores 
- ORDER BY nombre_equipo ASC; 

---
7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
- SELECT nombre, nombre_equipo 
- FROM jugadores where nombre_equipo='raptors' 
- ORDER BY nombre ASC;

---
8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
- SELECT puntos_por_partido 'puntos', nombre
- FROM estadisticas 
- INNER JOIN jugadores on jugador=codigo where nombre= 'Pau Gasol';

---
9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
- SELECT puntos_por_partido 'puntos', nombre, temporada
- FROM estadisticas inner join jugadores on jugador=codigo
- WHERE nombre= 'Pau Gasol' and temporada = '04/05';

---
10. Mostrar el número de puntos de cada jugador en toda su carrera.
- SELECT ROUND(SUM(puntos_por_partido)) 'puntos', nombre
- FROM estadisticas 
- INNER JOIN jugadores on jugador=codigo group by nombre;

---
11. Mostrar el número de jugadores de cada equipo.
- SELECT COUNT(codigo), nombre_equipo 
- FROM jugadores 
- GROUP BY nombre_equipo;

---
12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
- SELECT ROUND(SUM(puntos_por_partido)) as puntos, nombre
- FROM estadisticas 
- INNER JOIN jugadores on jugador=codigo 
group by nombre order by puntos desc limit 1;

---
13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
- SELECT j.nombre_equipo 'equipo', e.conferencia, e.division, j.altura
- FROM jugadores j inner join equipos e on e.nombre= j.nombre_equipo order by j.altura DESC LIMIT 1;

---
14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-SELECT AVG (suma)
-FROM (select sum(puntos_local + puntos_visitante) as suma from partidos p 
- INNER JOIN equipos e on p.equipo_local = e.nombre or p.equipo_visitante = e.nombre 
- WHERE e.division = 'pacific') as consulta;

---
15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.
-SELECT equipo_local, equipo_visitante, max(resta) AS diferencia
- FROM (select equipo_local, equipo_visitante, (SUM(puntos_local) - SUM(puntos_visitante) ) AS resta
- FROM partidos group by equipo_local, equipo_visitante) AS baba 
- GROUP BY equipo_local, equipo_visitante LIMIT 1;

---
16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
- SELECT AVG(Puntos_local + Puntos_visitante) AS Media_Puntos
- FROM partidos
- INNER JOIN equipos ON partidos.equipo_local = equipos.nombre
- WHERE equipos.division = 'Pacific';

---
17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
- SELECT equipo_local AS Equipo, SUM(puntos_local) AS Puntos_Local, SUM(puntos_visitante) AS Puntos_Visitante
- FROM partidos
- GROUP BY equipo_local
UNION
- SELECT equipo_visitante AS Equipo, SUM(puntos_visitante) AS Puntos_Local, SUM(puntos_local) AS Puntos_Visitante
- FROM partidos
- GROUP BY equipo_visitante;

---
18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null.
- SELECT codigo, equipo_local, equipo_visitante,
-       CASE
           WHEN puntos_local > puntos_visitante THEN equipo_local
           WHEN puntos_local < puntos_visitante THEN equipo_visitante
           ELSE NULL
-       END AS equipo_ganador
- FROM partidos;

---

---
Volver al principio del repositorio. [FullSTack_Egg](https://github.com/megagringa/FullStack_Egg_Curso)