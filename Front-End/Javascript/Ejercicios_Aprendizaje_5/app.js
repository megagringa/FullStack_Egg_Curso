document.getElementById('calculatorForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const value1 = parseInt(document.getElementById('value1').value);
    const value2 = parseInt(document.getElementById('value2').value);
    const operation = document.getElementById('operation').value.toUpperCase();
    let result;
  
    switch (operation) {
      case 'S':
        result = value1 + value2;
        break;
      case 'R':
        result = value1 - value2;
        break;
      case 'M':
        result = value1 * value2;
        break;
      case 'D':
        result = value1 / value2;
        break;
      default:
        result = 'Operación inválida';
    }
  
    document.getElementById('result').innerHTML = `El resultado es: ${result}`;
  });