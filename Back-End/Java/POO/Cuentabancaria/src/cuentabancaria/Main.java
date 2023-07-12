/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import Entidades.Cuenta;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = Cuenta.crearCuenta();
        cuenta.consultarDatos();
        cuenta.ingresar(2000);
        cuenta.consultarSaldo();
        cuenta.retirar(2500);
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
  
        
    }
    
}
