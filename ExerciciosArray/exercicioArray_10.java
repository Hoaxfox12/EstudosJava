package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        int aux2 = 0;
        int porcentagem1 = 0;
        int porcentagem2 = 0;
        int soma = 0;
        int soma2 = 0;
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o numero " + (i+1) + " do array ");
            num [i] = sc.nextInt();

        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                System.out.println("Numero" + num[i] + " é par");
                soma += num[i];
                aux++;
            }
            else {
                System.out.println("Numero" + num[i] + " é impar");
                soma2 += num[i];
                aux2++;
            }

            porcentagem1 = (aux*100) / num.length;
            porcentagem2= (aux2*100) / num.length;
        }
        System.out.println("Quantidade de números pares: " +aux);
        System.out.println("Soma do valores: "+ soma);
        System.out.println("Quantidade de números impares: " + aux2);
        System.out.println("Soma do valores: "+ soma2);
        System.out.println("Porcentagem de números pares é de : " + porcentagem1 + " % ");
        System.out.println("Porcentagem de números pares é de : " + porcentagem2 + " % ");
    }
}
