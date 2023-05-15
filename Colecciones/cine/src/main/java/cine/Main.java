/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cine;

import service.ServicePelicula;

/**
 *
 * @author ing_j
 */
public class Main {

    public static void main(String[] args) {
        ServicePelicula service = new ServicePelicula();
        service.cargarPelicula();
        System.out.println("--------------");
        service.mostrarPelicula();
        System.out.println("--------------");
        service.muestraHora();
        System.out.println("--------------");
        service.ordDesc();
        System.out.println("--------------");
        service.ordAsc();
        System.out.println("--------------");
        service.ordTit();
        System.out.println("--------------");
        service.ordDir();
    }
}
