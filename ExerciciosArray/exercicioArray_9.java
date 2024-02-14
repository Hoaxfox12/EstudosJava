package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        int soma = 0;
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++){
            System.out.println("Digite o numero " + i + " do array ");
            num [i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] % 5 == 0){
                System.out.println("Numero" + num[i] + " é multiplo de 5");
                soma += num[i];

            }

        }
        System.out.println(soma);
    }
}