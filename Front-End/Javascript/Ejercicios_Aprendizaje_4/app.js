function validarEntrada() {
    const inputChar = document.getElementById('inputChar').value.trim().toUpperCase();

    if (inputChar === 'S' || inputChar === 'N') {
        document.getElementById('resultado').innerText = 'CORRECTO';
    } else {
        document.getElementById('resultado').innerText = 'INCORRECTO';
    }
}