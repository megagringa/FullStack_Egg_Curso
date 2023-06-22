/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class EdificioDeOficinas extends Edificio {

    private int numeroOficinas;
    private int personaPorOficina;
    private int numeroPiso;

    public EdificioDeOficinas(int numeroOficinas, int personaPorOficina, int numeroPiso, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personaPorOficina = personaPorOficina;
        this.numeroPiso = numeroPiso;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho + largo + alto);//(ancho * largo + ancho * alto + largo * alto);//(ancho*2 + largo*2 + alto*2)
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }
    
    public void cantPersona(){
        int personasPorPiso = numeroOficinas * personaPorOficina;
        int personasTotal = personasPorPiso * numeroPiso;
        
        System.out.println("En un piso pueden trabajar: "+ personasPorPiso + " personas.");
        System.out.println("En todo el edificio pueden trabajar " + personasTotal + " personas.");
    }
        
}
