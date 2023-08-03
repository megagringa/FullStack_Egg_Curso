let limite;
let numeros = [];
let suma = 0;

function agregarNumero() {
    const numero = parseFloat(document.getElementById('numero').value);
    numeros.push(numero);
    suma += numero;
    document.getElementById('numero').value = '';
}

function calcularSuma() {
    limite = parseFloat(document.getElementById('limite').value);

    if (suma >= limite) {
        document.getElementById('resultado').textContent = `Se ha alcanzado el límite ${limite} con la suma ${suma}.`;
    } else {
        document.getElementById('resultado').textContent = `La suma actual es ${suma}. Sigue agregando números.`;
    }
}