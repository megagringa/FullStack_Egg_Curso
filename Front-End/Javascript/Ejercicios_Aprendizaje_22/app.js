// Obtén una referencia al botón y al área donde se mostrará el mensaje
const boton = document.getElementById("botonMensaje");
const mensajeMostrado = document.getElementById("mensajeMostrado");

// Agrega un evento de clic al botón
boton.addEventListener("click", function() {
    // Cambia el contenido del área de mensaje
    mensajeMostrado.textContent = "¡Mensaje a elección!";
});