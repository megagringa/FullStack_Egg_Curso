/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author CamiloH
 */
public class Paises {
    
        private String pais;

    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Paises{" + " País : " + pais + '}';
    }

    
    
        public static Comparator<Paises> ordenP = new Comparator<Paises>(){
        @Override
        public int compare(Paises p1, Paises p2){
            return p1.getPais().compareTo(p2.getPais());
        }
    };
    
    
    
        
    
        
        
    
}

