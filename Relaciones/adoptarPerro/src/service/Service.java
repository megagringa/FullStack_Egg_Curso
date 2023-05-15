/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Perro;
import entity.Person;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Service {

    Scanner read = new Scanner(System.in);
    Person person = new Person();
    Perro dog = new Perro();

    public void AsignarPerro(Person p, Perro d) {
        p.setPerro(d);
        mostrarPerro(p);

    }

    public void mostrarPerro(Person p) {
        System.out.println("A usted se le asigno este perro");
        System.out.println(p.toString());
    }
}
