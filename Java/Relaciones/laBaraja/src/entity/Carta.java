/*

 */
package entity;

/**
 *
 * @author ing_j
 */
public class Carta {
    private int numero;
    private String paloCarta;

    public Carta() {
    }

    public Carta(int numero, String paloCarta) {
        this.numero = numero;
        this.paloCarta = paloCarta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(String paloCarta) {
        this.paloCarta = paloCarta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCarta");
        sb.append("\nNumero= ").append(numero);
        sb.append("\nPalo= ").append(paloCarta);
        
        return sb.toString();
    }
    
    
}
