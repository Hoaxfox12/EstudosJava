package Exercicios;

import java.util.Scanner;

public class exercicioFor_6 {
    public static void main(String[] args) {
        int primeironum = 1; /* PRIMEIRO TERMO */
        int segundonum = 1; /* SEGUNDO TERMO */
        int proximo = 0;  /* AUXILIAR */
        /* BASICAMENTE, É UMA SOMA DE PROXIMO = PRIMEIRONUM + SEGUNDONUm
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o N-esimo termo da sequencia");
        int n = sc.nextInt();

        System.out.println(primeironum); /* Mostra as trocas*/
        System.out.println(segundonum);

        for (int i = 3; i <= n; i++) {
            proximo = primeironum + segundonum;  /* faz a soma */
            primeironum = segundonum;  /* primeironum recebe o valor do segundonum */
            segundonum = proximo;     /* valor de segundonum vai para o auxiliar */
            System.out.println(proximo);
        }
    }
}
