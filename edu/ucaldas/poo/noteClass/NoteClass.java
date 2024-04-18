package edu.ucaldas.poo.noteClass;

import java.util.Scanner;

public class NotasDeClase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        int totalCalificaciones = 0;
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorD = 0;
        int contadorF = 0;

        for (int i = 1; i <= numEstudiantes; i++){
            System.out.printf("Ingrese la nota del estudiante %d: ", i);
            int nota = scanner.nextInt();
            totalCalificaciones += nota;

            char letraCalificacion;
            switch (nota / 10){
                case 10:
                case 9:
                    letraCalificacion = 'A';
                    contadorA++;
                    break;

                case 8:
                    letraCalificacion = 'B';
                    contadorB++;
                    break;

                case 7:
                    letraCalificacion = 'C';
                    contadorC++;
                    break;

                case 6:
                    letraCalificacion = 'D';
                    contadorD++;
                    break;

                default:
                    letraCalificacion = 'F';
                    contadorF++;
                    break;
            }

            System.out.printf("El estudiante %d obtuvo la letra de calificacion %c\n", i, letraCalificacion);
        }

        double promedio = (double) totalCalificaciones / numEstudiantes;
        System.out.println("\nReporte:");
        System.out.println("Total de calificaciones: " + totalCalificaciones);
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Numero de estudiantes que recibieron cada letra de calificacion: ");
        System.out.println("A: " + contadorA);
        System.out.println("B: " + contadorB);
        System.out.println("C: " + contadorC);
        System.out.println("D: " + contadorD);
        System.out.println("F: " + contadorF);
    }
}
