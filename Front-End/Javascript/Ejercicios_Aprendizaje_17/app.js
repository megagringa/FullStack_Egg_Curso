document.addEventListener('DOMContentLoaded', function() {
    const eliminarButton = document.getElementById('eliminarButton');
    const resultadoElement = document.getElementById('resultado');
  
    eliminarButton.addEventListener('click', function() {
      // Crear un array de ejemplo
      const array = [1, 2, 3, 4, 5, 6];
  
      // Eliminar los dos últimos elementos
      const nuevosElementos = array.slice(0, array.length - 2);
  
      // Mostrar el resultado
      resultadoElement.textContent = 'Array original: ' + array.join(', ') + '\n' +
                                     'Array con los dos últimos elementos eliminados: ' + nuevosElementos.join(', ');
    });
  });