class Persona {
    constructor(nombre, edad, sexo, peso, altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
}

function obtenerPropiedades(persona) {
    return Object.keys(persona);
}

// Crear una instancia de Persona
const personaEjemplo = new Persona('Juan', 30, 'H', 70, 175);

// Obtener las propiedades y mostrarlas en la consola
const propiedadesPersona = obtenerPropiedades(personaEjemplo);
console.log(propiedadesPersona);