/*
 Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
 */
package excepciones_6;

/**
 *
 * @author ing_j
 */
public class Excepciones_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

//    public void metodoA() {
//        sentencia_a1 sentencia_a2
//        try {
//            sentencia_a3 sentencia_a4
//        } catch (MioException e) {
//            sentencia_a6
//        }
//        sentencia_a5
//    }
}

//    a1 y a2 se ejecutarían siempre. Luego, se ejecutaría la sentencia a3, 
//    seguida de la sentencia a4 dentro del bloque try. 
//    Si se produce la excepción MioException durante la ejecución de a3 o a4, 
//    el programa salta al bloque catch y ejecuta la sentencia a6. 
//    Finalmente, se ejecuta la sentencia a5.
//
//b) Si no se produce la excepción MioException, las sentencias se ejecutarían 
//   en el siguiente orden:
//
//   sentencia_a1
//   sentencia_a2
//   sentencia_a3
//   sentencia_a4
//   sentencia_a5
//En este caso, las sentencias a1 y a2 se ejecutarían siempre. 
//    Luego, se ejecutaría la sentencia a3, 
//    seguida de la sentencia a4 dentro del bloque try. 
//    Si no se produce la excepción MioException durante la ejecución de a3 o a4, 
//    el programa no saltaría al bloque catch y simplemente ejecutaría la sentencia a5.
}
