// Función para calcular el área y el perímetro de la circunferencia
function calculate() {
    const PI = Math.PI;
    const radius = parseFloat(document.getElementById("radius").value);
  
    // Validar que el radio sea un número positivo
    if (isNaN(radius) || radius <= 0) {
      alert("Por favor, ingrese un valor válido para el radio.");
      return;
    }
  
    // Calcular el área y el perímetro
    const area = PI * radius ** 2;
    const perimeter = 2 * PI * radius;
  
    // Mostrar los resultados en el HTML
    const resultElement = document.getElementById("result");
    resultElement.innerHTML = `Área: ${area.toFixed(2)}, Perímetro: ${perimeter.toFixed(2)}`;
  }