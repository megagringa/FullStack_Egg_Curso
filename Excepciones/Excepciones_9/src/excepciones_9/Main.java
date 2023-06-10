/*
 Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
 */
package excepciones_9;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        class C {
//
//            void metodoC() throws TuException {
//                sentencia_c1
//                try {
//                    sentencia_c2 sentencia_c3
//                } catch (MioException e) {
//                    sentencia_c4
//                } catch (TuException e) {
//                    sentencia_c5
//                    throw (e)
//                } finally sentencia_c6
//                }
//            }
       }
//a) Si se produce la excepción MioException, las sentencias se ejecutarían en el siguiente orden:
//
//sentencia_c1
//sentencia_c2
//sentencia_c3
//sentencia_c4
//sentencia_c6
//b) Si no se produce la excepción MioException, las sentencias se ejecutarían en el siguiente orden:
//
//sentencia_c1
//sentencia_c2
//sentencia_c3
//sentencia_c6
//c) Si se produce la excepción TuException, las sentencias se ejecutarían en el siguiente orden:
//
//sentencia_c1
//sentencia_c2
//sentencia_c3
//sentencia_c5
//throw (e) (lanza nuevamente la excepción)
//sentencia_c6
//En el caso de la excepción TuException, la sentencia_c5 se ejecuta antes de lanzar nuevamente la excepción, 
//mientras que en el caso de la excepción MioException, la sentencia_c4 se ejecuta sin lanzar nuevamente la excepción. 
//En ambos casos, la sentencia_c6 se ejecuta después del bloque try-catch.
}
