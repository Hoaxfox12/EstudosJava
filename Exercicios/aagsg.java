package Exercicios;

import java.util.Scanner;

public class aagsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 50;
        double aux = 1;
        double auxsoma = 0;



        for (long i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("" + i);

            }
            aux = aux * i;
            auxsoma += i;
        }
        System.out.println(aux);
        System.out.println(auxsoma);
    }
}
