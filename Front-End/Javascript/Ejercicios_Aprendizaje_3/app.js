function verificarEdad() {
    // Obtener el valor ingresado por el usuario
    var edadUsuario = document.getElementById('edad').value;

    // Convertir el valor a número entero
    var edad = parseInt(edadUsuario);

    // Verificar si el usuario es mayor de edad (mayor o igual a 18 años)
    if (edad >= 18) {
        document.getElementById('mensaje').textContent = "Eres mayor de edad.";
    } else {
        document.getElementById('mensaje').textContent = "Eres menor de edad.";
    }
}