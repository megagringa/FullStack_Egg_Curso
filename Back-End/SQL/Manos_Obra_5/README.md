### Actividad 5

Volveremos a abrir y ejecutar el script “superhéroe”.
Hasta el momento, nuestra base de datos “superhéroe” se encuentra vacía. Sólo tenemos la
estructura (tablas y columnas). Por lo que ahora es el turno de insertar registros en cada tabla. 

---

 a) Primero insertar en la tabla “creador” los siguientes datos:
- Tabla creador
   - INSERT INTO creador (id_creador, creador)
   - VALUES
   - (1, 'Marvel'),
   - (2, 'DC comics');

 b) Ahora, continuaremos insertando registros en la tabla personaje
- Tabla personaje
  - INSERT INTO personaje (id_personaje, nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
  - VALUES
   - (1, 'Bruce Banner', 'Hulk', 150, 600 mil, 75, 98, 1962, 'Físico Nuclear', 1),
   - (2, 'Tony Stark', 'Iron Man', 170, 200 mil, 70, 123, 1963, 'Inversor Industrial', 1),
   - (3, 'Thor Odinson', 'Thor', 145, infinita, 100, 235, 1962, 'Rey de Asgard', 1),
   - (4, 'Wanda Maximoff', 'Bruja Escarlata', 170, 100 mil, 90, 345, 1964, 'Bruja', 1),
   - (5, 'Carol Danvers', 'Capitana Marvel', 157, 250 mil, 85, 128, 1968, 'Oficial de Inteligencia', 1),
   - (6, 'Thanos', 'Thanos', 170, inifinita, 40, 306, 1973, 'Adorador de la Muerte', 1),
   - (7, 'Peter Parker', 'Spider Man', 165, 25 mil, 80, 74, 1962, 'Fotografo', 1),
   - (8, 'Steve Rogers', 'Captain America', 145, 600, 45, 60, 1941, 'Oficial Federal', 1),
   - (9, 'Bobby Drake', 'Ice Man', 140, 2 mil, 64, 122, 1963, 'Loco',1),
   - (10, 'Barry Allen', 'Flash', 160, 10 mil, 120, 168, 1956, 'Cientifico Forense', 2),
   - (11, 'Bruce Wayne', 'Batman', 170, 500, 32, 47, 1939, 'Hombre de Negocios', 2),
   - (12, 'Clark Kent', 'Superman', 165, infinita, 120, 182, 1948, 'Reportero', 2);

¡Felicitaciones! Creaste y completaste tu primera base de datos. A continuación, te pediremos
realices algunos cambios en ella así seguimos practicando lo aprendido

 a) Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman.
 - UPDATE personaje
 - SET aparicion = 1938
 - WHERE personaje = 'Superman';


 b) Eliminar el registro que contiene al personaje Flash.
 - DELETE FROM personaje
 - WHERE personaje = 'Flash';

---

### Actividad extra
Vamos a aprovechar que ya estamos trabajando con scripts y vamos a abrir el script llamado
“nba” y ejecutarlo de modo tal que se cree la base de datos y todas sus tablas, Este proceso
puede demorar, es normal y es super importante que lo hagas: ¡ten paciencia!
Esto lo hacemos porque más adelante la vamos a necesitar en el módulo de MySQL, entonces
mejor adelantarnos a ese momento y no perder tiempo cuando tengamos que trabajar sobre
dicha base de datos.

---

Descargar el contenido en la carpeta 
[Base de Datos](https://github.com/megagringa/FullStack_Egg_Curso/tree/main/BD-Descargas)

---

---

Volver al principio del repositorio. [FullSTack_Egg](https://github.com/megagringa/FullStack_Egg_Curso)