class App {
    encontrarPalabraMasLarga(texto) {
      const palabras = texto.split(" ");
      let palabraMasLarga = "";
  
      palabras.forEach((palabra) => {
        if (palabra.length > palabraMasLarga.length) {
          palabraMasLarga = palabra;
        }
      });
  
      return palabraMasLarga;
    }
  
    mostrarPalabraMasLarga() {
      const texto = document.getElementById("textoInput").value;
      const palabraMasLarga = this.encontrarPalabraMasLarga(texto);
      document.getElementById("resultado").innerText = "Palabra más larga: " + palabraMasLarga;
    }
  }
  
  // Instancia de la clase App
  const app = new App();