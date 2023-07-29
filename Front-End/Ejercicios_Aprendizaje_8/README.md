8) Definir las reglas CSS que permiten mostrar los enlaces con los siguientes estilos:
- En su estado normal, los enlaces se muestran de color rojo #CC0000.
- Cuando el usuario pasa su ratón sobre el enlace, se muestra con un color de fondo
rojo #CC0000 y la letra de color blanco #FFF.
- Los enlaces visitados se muestran en color gris claro #CCC

---
```
/* Estilo normal de los enlaces */
a {
  color: #CC0000;
  text-decoration: none; /* Para eliminar el subrayado por defecto en los enlaces */
}

/* Estilo al pasar el ratón sobre los enlaces */
a:hover {
  background-color: #CC0000;
  color: #FFF;
}

/* Estilo para los enlaces visitados */
a:visited {
  color: #CCC;
}
Explicación de cada regla:

a: Esta regla selecciona todos los elementos a (enlaces) del documento y establece el color de texto a rojo (#CC0000) y elimina la decoración de subrayado por defecto en los enlaces.

a:hover: Esta regla se aplica cuando el usuario pasa el ratón sobre un enlace (a:hover). En esta regla, establecemos el fondo a rojo (#CC0000) y el color del texto a blanco (#FFF) para resaltar el enlace cuando se encuentre en esta condición.

a:visited: Esta regla se aplica a los enlaces que han sido visitados previamente (a:visited). Establecemos el color de texto a gris claro (#CCC) para diferenciarlos de los enlaces no visitados.

```
---
