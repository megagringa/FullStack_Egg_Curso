document.getElementById("form1").addEventListener("submit", getFormValores);

function getFormValores(event) {
  event.preventDefault();
  
  var nombreInput = document.getElementsByName("nombre")[0];
  var apellidoInput = document.getElementsByName("apellido")[0];
  
  var nombre = nombreInput.value;
  var apellido = apellidoInput.value;
  
  console.log("Nombre:", nombre);
  console.log("Apellido:", apellido);
}