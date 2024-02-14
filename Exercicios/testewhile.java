package Exercicios;

import java.util.Scanner;

public class testewhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Entre com um número");
        num = sc.nextInt();

        calcularNumerosPrimos(num);

    }

    private static void calcularNumerosPrimos(int num) {
        boolean aux;
        int soma = 0;
        for (int i = 2; i <= num; i++) {
            aux = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    aux = false;
                    break;
                }
            }
            if (aux ) {
                System.out.println("" + i);
                soma += i;
            }
        }
    }
}
