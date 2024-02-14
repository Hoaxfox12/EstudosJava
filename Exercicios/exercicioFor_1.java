package Exercicios;

import java.util.Scanner;

public class exercicioFor_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* Inicia o scanner para inserir dados */
        int soma = 0; /* inteiro denominado soma é inicializado  em 0, ele v ai ser o auxiliar de soma*/
        int loop = sc.nextInt(); /* Aqui é inserido a quantidade de vezes que correrá o loop*/
        for (int i = 0; i < loop; i++){       /* Aqui ocorre o for que é executado até o valor de i se igualar ao loop */
            int auxSoma = sc.nextInt(); /* recebe os número que serão somados a cada passada de loop */
            soma = soma + auxSoma;   /* soma é utilizado como auxiliar, recebendo o primero valor de auxSoma e somando os demais*/
        }

        System.out.println(soma);
    }
}
