document.addEventListener("DOMContentLoaded", function () {
    // Crear arreglos
    var arregloA = [];
    var arregloB = new Array(20);

    // Inicializar arregloA con números aleatorios
    for (var i = 0; i < 50; i++) {
        arregloA.push(Math.random() * 100); // Genera números aleatorios entre 0 y 100
    }

    // Mostrar arregloA original
    mostrarArreglo("Arreglo A original:", arregloA);

    // Ordenar arregloA de menor a mayor
    arregloA.sort(function (a, b) {
        return a - b;
    });

    // Copiar los primeros 10 números ordenados a arregloB
    for (var i = 0; i < 10; i++) {
        arregloB[i] = arregloA[i];
    }

    // Rellenar los 10 últimos elementos de arregloB con 0.5
    for (var i = 10; i < arregloB.length; i++) {
        arregloB[i] = 0.5;
    }

    // Mostrar arregloA ordenado y arregloB combinado
    mostrarArreglo("Arreglo A ordenado:", arregloA);
    mostrarArreglo("Arreglo B combinado:", arregloB);
});

// Función para mostrar un arreglo en el elemento con id "output"
function mostrarArreglo(titulo, arreglo) {
    var outputDiv = document.getElementById("output");
    var contenido = titulo + "<br>" + arreglo.join(" ");
    outputDiv.innerHTML += contenido + "<br><br>";
}