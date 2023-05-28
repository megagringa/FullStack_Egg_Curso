/*
Ejercicio de Aprendizaje Extra.
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/
package test;

public class EjercicioAprendizaje12 {

    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            String num = String.format("%03d", i);
            if (num.charAt(0) == '3') {
                num = "E" + num.substring(1);
            }
            if (num.charAt(1) == '3') {
                num = "E" + num.substring(0, 1) + "E" + num.substring(2);
            }
            if (num.charAt(2) == '3') {
                num = num.substring(0, 2) + "E";
            }
            System.out.println(num);
        }

    }

}
