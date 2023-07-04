Importar el script de la base de datos llamada “pokemondb.sql” y ejecutarlo para crear todas
las tablas e insertar los registros en las mismas. A continuación, generar el modelo de entidad
relación y reorganizar las tablas para mayor claridad de sus relaciones. Deberá obtener un
diagrama de entidad de relación similar al que se muestra a continuación:
A continuación, se deben realizar las siguientes consultas:

---

Descargar el contenido en la carpeta 
[Base de Datos](https://github.com/megagringa/FullStack_Egg_Curso/tree/main/BD-Descargas)

---

---

Volver al principio del repositorio. [FullSTack_Egg](https://github.com/megagringa/FullStack_Egg_Curso)

---

1. Mostrar el nombre de todos los pokemon.

- SELECT nombre
- FROM pokemon;

---
2. Mostrar los pokemon que pesen menos de 10k.

- SELECT nombre, peso 
- FROM pokemon
- WHERE peso <10;

---
3. Mostrar los pokemon de tipo agua.

- SELECT * FROM pokemon;
- SELECT * FROM pokemon_tipo;
- SELECT * FROM tipo;
- SELECT p.nombre
- FROM pokemon p 
- JOIN pokemon_tipo pt on pt.numero_pokedex=p.numero_pokedex
- JOIN tipo t on t.id_tipo=pt.id_tipo where t.id_tipo=1;

---
4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.

- SELECT p.nombre, t.nombre 'tipo'
- FROM pokemon p join pokemon_tipo pt on pt.numero_pokedex=p.numero_pokedex
- JOIN tipo t on t.id_tipo=pt.id_tipo 
- WHERE t.id_tipo IN (1, 6, 13) order by t.nombre ASC;

---
5. Mostrar los pokemon que son de tipo fuego y volador.

- SELECT p.nombre, t.nombre 'tipo'
- FROM pokemon p join pokemon_tipo pt on pt.numero_pokedex=p.numero_pokedex
- JOIN tipo t on t.id_tipo=pt.id_tipo 
- WHERE t.id_tipo IN (6, 15);

---
6. Mostrar los pokemon con una estadística base de ps mayor que 200.

- SELECT * FROM estadisticas_base;
- SELECT * FROM pokemon;
- SELECT p.nombre, e.ps
- FROM pokemon p 
- JOIN estadisticas_base e on e.numero_pokedex=p.numero_pokedex 
- WHERE e.ps >200;

---
7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.

- SELECT nombre, peso, altura
- FROM pokemon
- WHERE numero_pokedex = (select max(numero_pokedex) 
    - FROM pokemon where numero_pokedex < 24);

---
8. Mostrar aquellos pokemon que evolucionan por intercambio.

- SELECT * FROM pokemon;
- SELECT * FROM pokemon_forma_evolucion;
- SELECT * FROM forma_evolucion;
- SELECT * FROM tipo_evolucion;
- SELECT p.nombre, te.tipo_evolucion
- FROM pokemon p join pokemon_forma_evolucion pf on pf.numero_pokedex=p.numero_pokedex
- JOIN forma_evolucion fe on fe.id_forma_evolucion= pf.id_forma_evolucion
- JOIN tipo_evolucion te on te.id_tipo_evolucion=fe.id_forma_evolucion 
- WHERE te.tipo_evolucion = 'intercambio';

---
9. Mostrar el nombre del movimiento con más prioridad.

- SELECT * 
- FROM movimiento 
- WHERE prioridad not in (0,-5,-6);

---
10. Mostrar el pokemon más pesado.

- SELECT * 
- FROM pokemon 
- ORDER BY peso DESC 
- LIMIT 1;

---
11. Mostrar el nombre y tipo del ataque con más potencia.

- SELECT * FROM tipo_ataque;
- SELECT * FROM tipo;
- SELECT * FROM movimiento;
- SELECT m.nombre 'ataque', ta.tipo, m.potencia
- FROM movimiento m 
- JOIN tipo t on t.id_tipo=m.id_tipo
- JOIN tipo_ataque ta on ta.id_tipo_ataque= t.id_tipo_ataque 
- ORDER BY m.potencia DESC 
- LIMIT 1;

---
12. Mostrar el número de movimientos de cada tipo.

- SELECT COUNT(m.id_tipo)'numero de movimientos', t.nombre 'tipo ataque'
- FROM movimiento m 
- JOIN tipo t on t.id_tipo=m.id_tipo 
- GROUP BY t.nombre;

---
13. Mostrar todos los movimientos que puedan envenenar.

- SELECT m.nombre, t.nombre 'tipo ataque'
- FROM movimiento m join tipo t on t.id_tipo=m.id_tipo 
- WHERE t.nombre= 'veneno';

---
14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.

- SELECT nombre, descripcion
- FROM movimiento 
- WHERE descripcion LIKE '%causa daño%' 
- ORDER BY nombre ASC;

---
15. Mostrar todos los movimientos que aprende pikachu.

- SELECT * FROM tipo_forma_aprendizaje;
- SELECT * FROM movimiento;
- SELECT * FROM pokemon_movimiento_forma;
- SELECT * FROM pokemon;
- SELECT DISTINCT p.nombre, m.nombre 'ataque'
- FROM pokemon p 
- JOIN pokemon_movimiento_forma pm ON pm.numero_pokedex=p.numero_pokedex
- JOIN movimiento m ON m.id_movimiento= pm.id_movimiento 
- WHERE p.nombre= 'pikachu';

---
16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).

- SELECT * FROM tipo_forma_aprendizaje;
- SELECT * FROM forma_aprendizaje;
- SELECT * FROM pokemon_movimiento_forma;
- SELECT * FROM movimiento;
- SELECT DISTINCT p.nombre, m.nombre 'ataque', tf.tipo_aprendizaje
- FROM pokemon p 
- JOIN pokemon_movimiento_forma pm ON pm.numero_pokedex=p.numero_pokedex
- JOIN movimiento m ON m.id_movimiento= pm.id_movimiento 
- JOIN forma_aprendizaje fa ON fa.id_forma_aprendizaje= pm.id_forma_aprendizaje
- JOIN tipo_forma_aprendizaje tf ON tf.id_tipo_aprendizaje = fa.id_tipo_aprendizaje - WHERE tf.tipo_aprendizaje = 'mt' AND
p.nombre= 'pikachu';

---
17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.

- SELECT DISTINCT p.nombre 'pokemon', m.nombre, tf.tipo_aprendizaje 'nivel', tt.nombre 'tipo'
- FROM pokemon p 
- JOIN pokemon_movimiento_forma pm on pm.numero_pokedex=p.numero_pokedex
- JOIN movimiento m ON m.id_movimiento= pm.id_movimiento 
- JOIN forma_aprendizaje fa ON fa.id_forma_aprendizaje= pm.id_forma_aprendizaje
- JOIN tipo_forma_aprendizaje tf ON tf.id_tipo_aprendizaje = fa.id_tipo_aprendizaje
- JOIN tipo tt ON tt.id_tipo = m.id_tipo
- WHERE tf.tipo_aprendizaje = 'nivel' and tt.nombre = 'normal' AND
p.nombre= 'pikachu';

---
18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.

- SELECT * FROM movimiento;
- SELECT * FROM movimiento_efecto_secundario;
- SELECT m.nombre 'movimiento', ms.probabilidad
- FROM movimiento m 
- JOIN movimiento_efecto_secundario ms ON ms.id_movimiento = m.id_movimiento
WHERE ms.probabilidad >30;

---
19. Mostrar todos los pokemon que evolucionan por piedra.

- SELECT * FROM pokemon;
- SELECT * FROM pokemon_forma_evolucion;
- SELECT * FROM forma_evolucion;
- SELECT * FROM tipo_evolucion;
- SELECT p.nombre
- FROM pokemon p 
- JOIN pokemon_forma_evolucion pf on pf.numero_pokedex=p.numero_pokedex
- JOIN forma_evolucion fe ON fe.id_forma_evolucion=pf.id_forma_evolucion
- JOIN tipo_evolucion te ON te.id_tipo_evolucion=fe.tipo_evolucion 
- WHERE te.tipo_evolucion = 'piedra';

---
20. Mostrar todos los pokemon que no pueden evolucionar.

- SELECT p.nombre
- FROM pokemon p
- LEFT JOIN pokemon_forma_evolucion pf ON pf.numero_pokedex = p.numero_pokedex
- WHERE pf.numero_pokedex is null;

---
21. Mostrar la cantidad de los pokemon de cada tipo. 

- SELECT * FROM pokemon;
- SELECT * FROM pokemon_tipo;
- SELECT * FROM tipo;
- SELECT COUNT(pt.id_tipo) 'cantidad pokemones', t.nombre 'tipo'
- FROM pokemon p 
- JOIN pokemon_tipo pt ON pt.numero_pokedex= p.numero_pokedex
- JOIN tipo t ON t.id_tipo= pt.id_tipo 
- GROUP BY t.nombre;

---
---