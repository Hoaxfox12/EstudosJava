package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class numeroParImparSwtichCase {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                calcPar();
                break;
            case 2:
                calcImpar();
                break;
            case 3:
                System.out.println("Input inválido");
                break;
        }
    }

    static void calcPar() {

        System.out.println("Digite o quantidade de números");
        int num = sc.nextInt();
        int aux = 0;
        int result1 = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
                aux += i;
            }
        }
        System.out.println("A soma dos pares dá (" +  aux + ")" );
    }

    static void calcImpar(){
        System.out.println("Digite o quantidade de números");
        int num = sc.nextInt();
        int aux = 0;
        int result2 = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.println(i + "");
                aux += i;
            }

        }
        System.out.println("A soma dos impares dá (" +  aux + ")" );
    }
}


