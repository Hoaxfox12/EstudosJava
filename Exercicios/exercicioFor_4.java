package Exercicios;

import java.util.*;

public class exercicioFor_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int qtenum;
        int soma = 0;
        System.out.println("Digite a quantidade de número que deseja");
        qtenum = sc.nextInt();

        for (int i = 1; i <= qtenum; i++){
            int numaux = sc.nextInt();
            soma += numaux ;
           
            if(numaux > maior){
                maior = numaux;
            }

            if (numaux < menor){
                menor = numaux;
            }

        }
        System.out.println(soma);
        System.out.println(maior);
        System.out.println(menor);
    }
}
