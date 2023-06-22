### Tabla Casa

| --- | id_casa | calle | numeracion | es_departamento |
| --- | --- | --- | --- | --- | 
| > | 163748 | Avenida el liberador | 1465 | 1 | 
| * | null | null | null | null |  



### Tabla Usuario

| --- | id_usuario | nombre | apellido | id_casa |
| --- | --- | --- | --- | --- |
| > | 854267 | Noelia | Devito | 163748 | 
| * | null | null | null | null | 

---
---

1) Primero deberás localizar en ambas tablas los siguientes elementos:

a). Llaves primarias

b). Llave foránea

c). Un campo que almacena datos de tipo carácter

d). Los atributos de cada tabla

e). Una tupla

---
a) Llaves primarias:

- Tabla Casa: id_casa
- Tabla Usuario: id_usuario

b) Llave foránea:

- Tabla Usuario: id_casa 

c) Un campo que almacena datos de tipo carácter:

- Tabla Casa: calle
- Tabla Usuario: nombre, apellido

d) Atributos de cada tabla:

- Tabla Casa: 
1) id_casa (llave primaria)
2) calle
3) numeracion
4) es_departamento

- Tabla Usuario:
1) id_usuario (llave primaria)
2) nombre
3) apellido
4) id_casa (llave foránea)

e) Una tupla:

- Tabla Casa: (163748, "Avenida el liberador", 1465, 1)
- Tabla Usuario: (854267, "Noelia", "Devito", 163748)

---
---
2) Compara tus respuestas con las de tus compañeros: recuerda abordar cada duda que
tengas, a partir de ellas es que fortalecemos el aprendizaje.

---
---

3) ¿Cuál es la función de una llave primaria? Selecciona la opción correcta:

a). Una llave primaria identifica a cada registro imposibilitando la repetición de un mismo
registro, y por defecto, la redundancia

b). Una llave primaria, por buenas prácticas, debería ser un valor abstracto de la relación y
su valor debería ser autogenerado

c). Una llave primaria es un elemento clave en la relación entre tablas, ya que, para la
existencia de una llave foránea, se requiere anteriormente, la de una llave primaria

d). Todas las anteriores son correctas

---
d). Todas las anteriores son correctas

---

Volver al principio del repositorio. [FullSTack_Egg](https://github.com/megagringa/FullStack_Egg_Curso)