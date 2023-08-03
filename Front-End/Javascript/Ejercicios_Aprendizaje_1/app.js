class EstadoDia {
    static mostrarEstadoDia() {
        // Obtener el valor ingresado por el usuario
        const estadoDia = document.getElementById('estadoDiaInput').value;

        // Mostrar el mensaje con el estado ingresado por el usuario
        switch (estadoDia.toLowerCase()) {
            case "soleado":
                alert("El día de hoy está soleado.");
                break;
            case "nublado":
                alert("El día de hoy está nublado.");
                break;
            case "lloviendo":
                alert("El día de hoy está lloviendo.");
                break;
            default:
                alert("No se reconoce el estado del día ingresado.");
                break;
        }
    }
}

function mostrarEstadoDia() {
    EstadoDia.mostrarEstadoDia();
}