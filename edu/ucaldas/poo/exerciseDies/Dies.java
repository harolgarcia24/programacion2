package edu.ucaldas.poo.exerciseDies;

import java.util.Random;

public class EjercicioDados {
    public static void main(String[] args) {
        Random random = new Random();
        boolean continuar = true;
        int punto = 0;

        System.out.println("Simulemos un lanzamiento de unos dados");

        int puntaje = tirarDados(random);
        System.out.println("Salio el numero: " + puntaje);

        if (puntaje == 7 || puntaje == 1) {
            System.out.println("Felicidades, Ganaste en el primer intento");
            continuar = false;
        } else if (puntaje == 2 || puntaje == 3 || puntaje == 12) {
            System.out.println("Que mala suerte, Perdiste");
            continuar = false;
        } else {
            punto = puntaje;
            System.out.println("Lanza de nuevo, tu puntaje es: " + punto);
        }

        while (continuar) {
            puntaje = tirarDados(random);

            if (puntaje == punto) {
                System.out.println("Salio: " + puntaje + " Felicidades, Ganaste");
                continuar = false;
            } else if (puntaje == 7) {
                System.out.println("Salio: " + puntaje + " Que mala suerte, Perdiste");
                continuar = false;
            } else {
                System.out.println("Salio: " + puntaje + " Lanza de nuevo");
            }
        }
    }

    public static int tirarDados(Random random) {
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        return dado1 + dado2;
    }
}