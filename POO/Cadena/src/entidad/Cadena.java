/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author ing_j
 */
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
        this.frase = "";
        this.longitud = 0;
    }

    //public int getLongitud() {
       // return longitud;
    //}

    //public void setLongitud(int longitud) {
        //this.longitud = longitud;
    //}

    
    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void mostrarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < frase.length(); i++) {
            char f = frase.charAt(i);
            if (vocales.indexOf(f) != -1) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales.");

    }

    public void invertirFrase() {
        StringBuilder leer = new StringBuilder(frase); //modifica una cadena sin crear un objeto
        leer.reverse();
        System.out.println("La frase invertida es: " + leer.toString());

    }

    public void vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + contador + " veces.");
    }

    public void compararLongitud(String frase) {
        if (this.longitud == frase.length()) {
            System.out.println("Tienen la misma longitud.");
        } else if (this.longitud < frase.length()) {
            System.out.println("La frase nueva es mas larga.");
        } else {
            System.out.println("La frase nueva es mas corta.");
        }
    }

    public void unirfrases(String frase) {
        String union = this.frase + " " + frase;
        System.out.println("La frase: " + union);
    }

    public void reemplazar(String letra, String nuevaLetra) {
        String reemplazo = frase.replace(letra.charAt(0), nuevaLetra.charAt(0));
        System.out.println("La frase reemplazada es: " + reemplazo);
    }

    public boolean contiene(String letra) {
        return frase.indexOf(letra.charAt(0)) != -1;//devuelve el índice, dentro del objeto String que realiza la llamada, de la primera ocurrencia del valor especificado, comenzando la búsqueda desde indiceDesde ; o -1 si no se encuentra dicho valor.

    }

}
