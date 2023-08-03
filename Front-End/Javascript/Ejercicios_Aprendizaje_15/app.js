class Circle {
    constructor(radius) {
      this.radius = radius;
    }
  
    getArea() {
      return Math.PI * this.radius ** 2;
    }
  
    getPerimeter() {
      return 2 * Math.PI * this.radius;
    }
  }
  
  // Función para calcular el área y el perímetro y mostrar los resultados en la página HTML
  function calculate() {
    const radiusInput = document.getElementById("radius");
    const outputArea = document.getElementById("output-area");
    const outputPerimeter = document.getElementById("output-perimeter");
  
    const radius = parseFloat(radiusInput.value);
  
    if (!isNaN(radius) && radius >= 0) {
      const circle = new Circle(radius);
      const area = circle.getArea().toFixed(2);
      const perimeter = circle.getPerimeter().toFixed(2);
  
      outputArea.textContent = `Área: ${area}`;
      outputPerimeter.textContent = `Perímetro: ${perimeter}`;
    } else {
      outputArea.textContent = "Ingrese un valor válido para el radio.";
      outputPerimeter.textContent = "";
    }
  }
  