package Exercicios;

import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean eVdd;
        int soma = 0;
        System.out.println("Entre com um número");
        num = sc.nextInt();

        for (int i = 2; i <= num; i++){/* itera do um ao número desejado para identificar os números primos*/
                eVdd = true;

            for (int j = 2; j < i; j++){  /* checa divisibilidade por 2*/
                if (i%j==0){
                    eVdd = false;
                    break;
                }
            }
            if (eVdd){
                System.out.println("" + i);
            }
        }

        }

}



