// Definir la función flecha que invierte una palabra
//.split =>convierte la cadena ingresa en un array de sub cadenas . ('') -> probar con - dentro de las comillas
//.reverse => invierte el orden de sub cadenas.
//.join => une elementos de una cadena de texto. ('') -> probar con - dentro de las comillas 
const reverseWord = (word) => {
    return word.split('').reverse().join('');
    //return word.reverse(); -> asi no muestra nada.
  };
  
  // Evento al hacer clic en el botón
  document.getElementById('reverseButton').addEventListener('click', () => {
    const inputElement = document.getElementById('inputWord');
    const outputElement = document.getElementById('outputWord');
  
    const word = inputElement.value;
    const reversedWord = reverseWord(word);
    outputElement.textContent = reversedWord;
  });