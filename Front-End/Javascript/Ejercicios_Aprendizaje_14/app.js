class Libro {
    constructor(isbn, titulo, autor, numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    cargarLibro() {
        this.isbn = prompt("Ingrese el ISBN del libro:");
        this.titulo = prompt("Ingrese el título del libro:");
        this.autor = prompt("Ingrese el autor del libro:");
        this.numPaginas = parseInt(prompt("Ingrese el número de páginas del libro:"));
    }

    informarDatos() {
        const resultado = `
            ISBN: ${this.isbn}
            Título: ${this.titulo}
            Autor: ${this.autor}
            Número de páginas: ${this.numPaginas}
        `;
        document.getElementById("result").innerText = resultado;
    }
}

// Crear un nuevo libro
const miLibro = new Libro();

// Cargar el libro con los datos ingresados por el usuario
miLibro.cargarLibro();

// Mostrar la información del libro en la página
miLibro.informarDatos();