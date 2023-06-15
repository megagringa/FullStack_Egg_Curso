/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package excepciones_2;

import entity.MyClass;

/**
 *
 * @author ing_j
 */
public class Excepciones_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass myObject = new MyClass(5);

        myObject.setValue(0, 10);
        myObject.setValue(1, 20);
        myObject.setValue(5, 30); // Índice fuera de rango

        System.out.println(myObject.getValue(0)); // 10
        System.out.println(myObject.getValue(1)); // 20
        System.out.println(myObject.getValue(5)); // -1 (error)
    }
}
