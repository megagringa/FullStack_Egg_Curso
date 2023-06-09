/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class MyClass {
    private int[] myArray;

    public MyClass(int size) {
        myArray = new int[size];
    }

    public void setValue(int index, int value) {
        try {
            myArray[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice de arreglo fuera de rango.");
        }
    }

    public int getValue(int index) {
        try {
            return myArray[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice de arreglo fuera de rango.");
            return -1; // Valor por defecto para indicar error
        }
    }
}
