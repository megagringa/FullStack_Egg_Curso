/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import entidades.Paises;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class ServicePaises {

    // HashSet<String> listaP = new HashSet();
    HashSet<Paises> listaP = new HashSet();
    Paises paises = new Paises();
    Scanner leer = new Scanner(System.in);

    public void ingresarPaises() {
        String opcion;

        do {

            System.out.println("Ingrese el nombre del país");

            paises.setPais(leer.nextLine());
            Paises pa = new Paises(paises.getPais());
            listaP.add(pa);

            System.out.println("¿Desea agregar otro país?  s/n : ");
            opcion = leer.nextLine();
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("");
    }

    public void mostrarPaises() {
        for (Paises paises1 : listaP) {
            System.out.println("Pais: " + paises1);
        }

    }

    public void ordenarPaises() {
        ArrayList<Paises> ordenar = new ArrayList(listaP);
        //Collections.sort(ordenar);
        Collections.sort(ordenar, Paises.ordenP);
        for (Paises ordenAlfa : ordenar) {
            System.out.println("País:" + ordenAlfa);
        }

    }

    public void eliminarPaises() {
        System.out.println("Ingrese un país a eliminar: ");
        String del = leer.nextLine();
        Iterator<Paises> ite = listaP.iterator();

        int cont = 0;
        while (ite.hasNext()) {
            Paises p = ite.next();

            if (p.getPais().equals(del)) {
                ite.remove();
                System.out.println("País eliminado...");

                cont++;

            }

        }
        if (cont == 0) {
            System.out.println("No se encuentra el país a eliminar");

        }
        mostrarPaises();

    }

}