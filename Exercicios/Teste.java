package Exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int soma = 0;
        int somapar = 0;

        for (int i = 1; i <= num; i++){
            if (i % 2 == 1){
                soma = soma + i;
            } else {
                somapar = somapar + i;
            }
        }
        System.out.println(soma);
        System.out.println(somapar);
    }
}
