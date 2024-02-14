package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int aux = 0;
        int soma = 0;

        for (int i = 0; i < num.length; i++){
            System.out.println(" Digite o " + (i + 1 ) + " Dígito do array ");
            num [i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 1){
                soma += num[i];
                System.out.println("Número par " + i + " foi removido da soma ");
            } else{
                System.out.println("Número ímpar " +  i +  " foi adicionado");
            }


        }
        System.out.println(soma);
    }
}
