// Función para generar un valor aleatorio entre un rango dado
function getRandomValue(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

// Función para rellenar un vector con valores aleatorios
function fillRandomVector(vector, size, minValue, maxValue) {
    for (let i = 0; i < size; i++) {
        vector.push(getRandomValue(minValue, maxValue));
    }
}

// Vectores para almacenar los valores aleatorios
let vector1 = [];
let vector2 = [];

// Rellenar los vectores con valores aleatorios
fillRandomVector(vector1, 5, 1, 100);
fillRandomVector(vector2, 5, 1, 100);

// Mostrar los vectores por pantalla
const outputDiv = document.getElementById('output');
outputDiv.innerHTML += `<p>Vector 1: [${vector1.join(', ')}]</p>`;
outputDiv.innerHTML += `<p>Vector 2: [${vector2.join(', ')}]</p>`;