// Definir la función flecha que invierte una palabra
const reverseWord = (word) => {
    return word.split('').reverse().join('');
  };
  
  // Evento al hacer clic en el botón
  document.getElementById('reverseButton').addEventListener('click', () => {
    const inputElement = document.getElementById('inputWord');
    const outputElement = document.getElementById('outputWord');
  
    const word = inputElement.value;
    const reversedWord = reverseWord(word);
    outputElement.textContent = reversedWord;
  });