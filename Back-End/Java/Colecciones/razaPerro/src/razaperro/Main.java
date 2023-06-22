/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package razaperro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String raza;
        boolean agregar = true;
        
        while(agregar){
            System.out.println("Ingresar raza de perro: ");
            raza = leer.nextLine();
            perros.add(raza);
            System.out.println("Agregar otro.(s/n)");
            String respuesta = leer.nextLine();
            if(respuesta.equalsIgnoreCase("n")){
                agregar = false;
            }
        }
        System.out.println("Perros: ");
        for (String perro : perros){
            System.out.println(perro);
        }
    }
    
}
