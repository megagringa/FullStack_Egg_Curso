/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package razaperrocontinuo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
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
        
        System.out.println("Eliminar perro: ");
        String eliminarRaza = leer.nextLine();
        
        Iterator<String> it = perros.iterator();
        boolean encontrado = false;
        
        while(it.hasNext()){
            String perro = it.next();
            if(perro.equals(eliminarRaza)){
                it.remove();
                encontrado = true;
                break;
            }
        }
        
        System.out.println("Perros: ");
        for (String perro : perros){
            System.out.println(perro);
        }
    }
    
}
