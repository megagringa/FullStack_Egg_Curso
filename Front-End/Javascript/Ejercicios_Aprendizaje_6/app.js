function esPar(numero) {
    return numero % 2 === 0;
}

function verificarParImpar() {
    const numero = parseInt(document.getElementById('numero').value);

    if (isNaN(numero)) {
        document.getElementById('resultado').innerText = 'Por favor, ingresa un número válido.';
        return;
    }

    if (numero === 0) {
        document.getElementById('resultado').innerText = 'El número no es par ni impar.';
    } else if (esPar(numero)) {
        document.getElementById('resultado').innerText = 'El número es par.';
    } else {
        document.getElementById('resultado').innerText = 'El número es impar.';
    }
}