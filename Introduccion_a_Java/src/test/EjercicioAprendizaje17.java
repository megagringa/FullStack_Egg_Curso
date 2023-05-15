package javaintro.exercises;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise17 {

    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).*/

        int vector[] = new int[100], counter[] = new int[5];
        int length;

        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        for (int i = 0; i < 100; i++) {
            length = 0;
            while (vector[i] != 0) {
                vector[i] /= 10;
                length++;
            }

            switch (length) {
                case 1:
                    counter[0]++;
                    break;
                case 2:
                    counter[1]++;
                    break;
                case 3:
                    counter[2]++;
                    break;
                case 4:
                    counter[3]++;
                    break;
                case 5:
                    counter[4]++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Se encontraron: " + counter[0] + " numeros de 1 digito, " + counter[1] + " numeros de 2 digitos, " + counter[2] + " numeros de 3 digitos, " + counter[3] + " numeros de 4 digitos y " + counter[4] + " numeros de 5 digitos.");
    }
}
