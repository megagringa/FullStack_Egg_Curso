/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package armor;


/**
 *
 * @author ing_j
 */
public class Armadura {
   private String colorP;
    private String colorS;
    private int resistencia;
    private Integer salud;
    private Guante guanteIzq;
    private Guante guanteDer;
    private Bota botaIzq;
    private Bota botaDer;
    private Casco casco;
    private Generador generador;

    public Armadura() {
        this.colorP = "gris";
        this.colorS = "gris";
        this.resistencia = 0;
        this.salud = 100;
        this.guanteIzq = new Guante("Guante Izquierdo");
        this.guanteDer = new Guante("Guante Derecho");
        this.botaIzq = new Bota("Bota Izquierda");
        this.botaDer = new Bota("Bota Derecha");
        this.casco = new Casco();
        this.generador = new Generador();
    }

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public String getColorS() {
        return colorS;
    }

    public void setColorS(String colorS) {
        this.colorS = colorS;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    @Override
    public String toString() {
        System.out.println(
                "Armadura " + "color Principal =" + colorP + ", color Secundario=" + colorS + ""
                + "\n resistencia=" + resistencia + ", salud=" + salud + ""
                + "\n guanteIzq=" + guanteIzq + ", guanteDer=" + guanteDer + ""
                + "\n botaIzq=" + botaIzq + ", botaDer=" + botaDer + ""
                + "\n casco=" + casco + ""
                + "\n generador=" + generador + '\n');
        return "";
    }
}
    

