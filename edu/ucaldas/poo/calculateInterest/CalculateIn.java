package edu.ucaldas.poo.calculateInterest;

public class CalculoInteres {
    public static void main (String[] args) {
        double p = 1000;
        int n = 10;
        double r = 0.05;
        double a, j;

        for (int i = 1; i <= 10; i++) {
            j = p * r;
            a = p + j;
            p = a;
            System.out.println("El monto de el año " + i + " es de " + a);
        }
    }
}
