package Exercicios;

import java.util.Scanner;

public class exercicioFor_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat = 1;
        int input;

        System.out.println("Insira o fatorial");
        input = sc.nextInt();

        System.out.println ( input + " ! " );
        System.out.println(input);
        for (int i = input; i > 1 ; i-- ){
            fat *= i;
            System.out.print(i + ".");
        }
        System.out.println(fat);
    }
}
