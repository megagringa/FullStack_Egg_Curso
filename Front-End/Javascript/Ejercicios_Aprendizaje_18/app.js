let valores = [true, 5, false, "hola", "adios", 2];

// Parte a)
let texto1 = valores[3];
let texto2 = valores[4];

if (texto1 > texto2) {
  console.log(texto1 + " es mayor que " + texto2);
} else if (texto2 > texto1) {
  console.log(texto2 + " es mayor que " + texto1);
} else {
  console.log("Los textos son iguales.");
}

// Parte b)
let valorBooleano1 = valores[0];
let valorBooleano2 = valores[2];

let resultadoTrue = valorBooleano1 || valorBooleano2;  // true || false = true
let resultadoFalse = valorBooleano1 && valorBooleano2; // true && false = false

console.log("Resultado True:", resultadoTrue);
console.log("Resultado False:", resultadoFalse);

// Parte c)
let numero1 = valores[1];
let numero2 = valores[5];

let suma = numero1 + numero2;
let resta = numero1 - numero2;
let multiplicacion = numero1 * numero2;
let division = numero1 / numero2;
let modulo = numero1 % numero2;

console.log("Suma:", suma);
console.log("Resta:", resta);
console.log("Multiplicación:", multiplicacion);
console.log("División:", division);
console.log("Módulo:", modulo);