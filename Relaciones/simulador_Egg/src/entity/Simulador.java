/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Simulador {

    Scanner read = new Scanner(System.in);

    private static final int NUM_ALUMNOS_GENERAR = 10;
    private static final int NUM_ALUMNOS_ELEGIDOS = 5;
    private static final int NUM_VOTOS_POR_ALUMNO = 3;

    private List<String> nombres;
    private List<String> apellidos;
    private List<String> dnis;

    public Simulador() {
        nombres = new ArrayList<>(Arrays.asList("Juan", "María", "Carlos", "Laura", "Pedro", "Ana", "Luis", "Marta", "José", "Sofía"));
        apellidos = new ArrayList<>(Arrays.asList("Gómez", "López", "Fernández", "Rodríguez", "Martínez", "Pérez", "González", "Sánchez", "Romero", "Torres"));
        dnis = generarDnis();
    }

    public List<String> generarDnis() {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < NUM_ALUMNOS_GENERAR; i++) {
            int dni = random.nextInt(99999999 - 10000000 + 1) + 10000000;
            dnis.add(String.valueOf(dni));
        }

        return dnis;
    }

    public List<Alumno> generarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < NUM_ALUMNOS_GENERAR; i++) {
            String nombre = nombres.get(random.nextInt(nombres.size()));
            String apellido = apellidos.get(random.nextInt(apellidos.size()));
            String dni = dnis.get(i);

            alumnos.add(new Alumno(nombre + " " + apellido, dni));
        }

        return alumnos;
    }

    public void asignarVotos(List<Alumno> alumnos) {
        Random random = new Random();
        Set<Integer> votosUtilizados = new HashSet<>();

        for (Alumno alumno : alumnos) {
            List<Alumno> votos = new ArrayList<>();

            while (votos.size() < NUM_VOTOS_POR_ALUMNO) {
                int indiceAlumnoVotado = random.nextInt(alumnos.size());
                Alumno alumnoVotado = alumnos.get(indiceAlumnoVotado);

                if (!alumno.equals(alumnoVotado) && !votosUtilizados.contains(indiceAlumnoVotado)) {
                    votos.add(alumnoVotado);
                    votosUtilizados.add(indiceAlumnoVotado);
                }
            }

            for (Alumno votado : votos) {
                votado.incrementarVotos();
            }

            /*Voto voto = new Voto(alumno, votos);
            System.out.println("Voto de " + alumno.getNombreCompleto() + ": " + voto.getAlumnosVotados());
           System.out.println();*/
          break;
        }
         
    }

    public void mostrarRecuentoVotos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos recibidos: ");
            for (Alumno votante : alumnos) {
                if (votante.getCantidadVotos() > 0 && !votante.getNombreCompleto().equals(alumno.getNombreCompleto())) {
                    System.out.println("- " + votante.getNombreCompleto());
                }
            }
            System.out.println();
        }
    }

    public void mostrarFacilitadores(List<Alumno> alumnos) { // mejor muestra

        Collections.sort(alumnos, (a1, a2) -> Integer.compare(a2.getCantidadVotos(), a1.getCantidadVotos()));
        asignarVotos(alumnos);
        System.out.println("Facilitadores:");
        for (int i = 0; i < NUM_ALUMNOS_ELEGIDOS; i++) {
            Alumno facilitador = alumnos.get(i);
            System.out.println((i + 1) + ". " + facilitador.getNombreCompleto());
        }

        System.out.println();

        System.out.println("Facilitadores Suplentes:");
        for (int i = NUM_ALUMNOS_ELEGIDOS; i < 2 * NUM_ALUMNOS_ELEGIDOS; i++) {
            Alumno facilitadorSuplente = alumnos.get(i);
            System.out.println((i - NUM_ALUMNOS_ELEGIDOS + 1) + ". " + facilitadorSuplente.getNombreCompleto());
        }
    }

    public void menu(List<Alumno> alumni) {
        boolean flag = true;
        do {

            System.out.println("======================================================================================================");
            System.out.println("            Simulador del Sistema de votacion para Facilitadores EGG: SSFEGG V9.13");
            System.out.println("======================================================================================================");
            System.out.println("| 1. Mostrar listado de alumnos | 2. Asignar Votos | | 3. Mostrar recuento de votos | 4. Mostrar facilitadores | 5. Salir |");
            System.out.println("");
            System.out.println("Elija una opcion: ");
            int option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.println("======================================================================================================");

                    System.out.println("Listado de alumnos:");
                    for (Alumno alumno : alumni) {
                        System.out.println(alumno.getNombreCompleto() + " DNI: " + alumno.getDni());
                    }
                    break;
                case 2:
                    System.out.println("======================================================================================================");
                    asignarVotos(alumni);
                    System.out.println("Votos asignados.");
                    break;
                case 3:
                    System.out.println("======================================================================================================");
                    //asignarVotos(alumni);
                    mostrarRecuentoVotos(alumni);
                    break;
                case 4:
                    System.out.println("======================================================================================================");

                    mostrarFacilitadores(alumni);
                    break;
                case 5:
                    System.out.println("saliendo...");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (flag == true);
    }
}
