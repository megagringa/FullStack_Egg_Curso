/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import Entidades.Cuenta;
import service.Service;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Service service = new Service();
        Cuenta cuenta = service.crearCuenta();
        cuenta.consultarDatos();
        System.out.println("-----------");
        System.out.println("-----------");
        cuenta.ingresar(2000);
        cuenta.consultarSaldo();
        System.out.println("-----------");
        System.out.println("-----------");
        cuenta.retirar(2500);
        cuenta.consultarSaldo();
        System.out.println("-----------");
        System.out.println("-----------");
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        System.out.println("-----------");
        System.out.println("-----------");
        
    }
    
}