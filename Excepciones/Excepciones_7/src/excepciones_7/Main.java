/*
 Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
 */
package excepciones_7;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        class B {
//
//            public void metodoB() {
//                sentencia_b1
//                try {
//                    sentencia_b2
//                } catch (MioException e) {
//                    sentencia_b3
//                } finally sentencia_b4
//                }
//            }
        }
    
    
//   sentencia_b1: Se ejecuta en primer lugar, antes del bloque try-catch.
//   sentencia_b2: Se ejecuta dentro del bloque try.
//   MioException: Se produce una excepción MioException y se captura en el bloque catch.
//   sentencia_b3: Se ejecuta dentro del bloque catch después de capturar la excepción.
//   sentencia_b4: Se ejecuta después del bloque try-catch, incluso si se produce una excepción.
//   El orden general de ejecución sería: sentencia_b1, sentencia_b2, MioException (capturada en catch), 
//   sentencia_b3, sentencia_b4.
//
//   b) Si no se produce la excepción MioException, las sentencias se ejecutan en el siguiente orden:
//
//   sentencia_b1: Se ejecuta en primer lugar, antes del bloque try-catch.
//   sentencia_b2: Se ejecuta dentro del bloque try.
//   No se produce la excepción MioException, por lo que el bloque catch se omite.
//   sentencia_b4: Se ejecuta después del bloque try, incluso si no se produjo una excepción.
//   El orden general de ejecución sería: sentencia_b1, sentencia_b2, sentencia_b4.

    }
