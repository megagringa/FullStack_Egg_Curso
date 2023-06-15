/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ing_j
 */
public class Main {

    
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];

        Random random = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextDouble() * 100;
        }

        System.out.println("Arreglo A: "+ Arrays.toString(A));
        Arrays.sort(A);//Ordena arreglos de menor a mayor.

        for (int i = 0; i < 10; i++) {
            B[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = 0.5;
        }

        System.out.println("Arreglo A ordenado: "+Arrays.toString(A));
        System.out.println("Arreglo B combinado: "+Arrays.toString(B));
        
    }

}
