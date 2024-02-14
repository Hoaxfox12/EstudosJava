package Exercicios;

import java.util.Scanner;

public class exercicioFor_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int notas;
        int display = 0;
        int input;
        int medias = 0;

        System.out.println("Digite a quantidade de notas");
        notas = scan.nextInt();

        for (int i = 1; i<=notas; i++){
            System.out.println("Digite as notas");
            input = scan.nextInt();
            medias += input;
            display = medias/notas;
        }
        System.out.println(medias);
        System.out.println(display);
    }
}
