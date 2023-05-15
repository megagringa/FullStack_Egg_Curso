package javaintro.exercises;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise18 {

    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. 
        La matriz traspuesta de una matriz A se denota por B y se
        obtiene cambiando sus filas por columnas (o viceversa).*/

        int matrix[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matrix[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
