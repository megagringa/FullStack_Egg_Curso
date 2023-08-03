let numeros = [];
let maximo = -Infinity;
let minimo = Infinity;
let promedio = 0;

function agregarNumero() {
  const numero = parseInt(document.getElementById('numero').value);

  if (isNaN(numero)) {
    alert('Ingresa un número válido.');
    return;
  }

  numeros.push(numero);
  document.getElementById('numero').value = '';

  if (numero !== 0) {
    maximo = Math.max(maximo, numero);
    minimo = Math.min(minimo, numero);
    promedio = numeros.reduce((acc, curr) => acc + curr, 0) / numeros.length;
  } else {
    mostrarResultados();
  }
}

function mostrarResultados() {
  document.getElementById('maximo').textContent = `El máximo número ingresado es: ${maximo}`;
  document.getElementById('minimo').textContent = `El mínimo número ingresado es: ${minimo}`;
  document.getElementById('promedio').textContent = `El promedio de todos los números es: ${promedio}`;
}