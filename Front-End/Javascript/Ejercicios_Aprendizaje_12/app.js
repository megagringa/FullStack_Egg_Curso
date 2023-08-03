const obtenerTipoDeDato = (dato) => {
    return typeof dato;
  };
  
  const obtenerTipoYMostrarResultado = () => {
    const valorInput = document.getElementById('valor').value;
    const resultado = obtenerTipoDeDato(valorInput);
    document.getElementById('resultado').innerText = `El tipo de dato es: ${resultado}`;
  };
  
  document.addEventListener('DOMContentLoaded', () => {
    const botonObtenerTipo = document.getElementById('boton-obtener-tipo');
    botonObtenerTipo.addEventListener('click', obtenerTipoYMostrarResultado);
  });