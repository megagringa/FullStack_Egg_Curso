function separarConEspacio() {
    const fraseInput = document.getElementById('frase').value;
    const fraseSeparada = separarLetrasConEspacio(fraseInput);
    document.getElementById('resultado').textContent = fraseSeparada;
}

function separarLetrasConEspacio(frase) {
    let fraseSeparada = '';
    for (let i = 0; i < frase.length; i++) {
        fraseSeparada += frase[i] + ' ';
    }
    return fraseSeparada.trim();
}


