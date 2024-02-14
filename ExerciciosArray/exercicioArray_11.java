package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int menor = 0;
        int maior = 0;

        for (int i = 0; i < num.length ;i++ ){
            System.out.println(" Digite o " + (i + 1 ) + " Dígito do array ");
            num [i] = sc.nextInt();

        }

        for (int i =0; i < num.length; i++){
            //compara o valor, se o valor do vetor for menor do que o menor valor iterado no  loop, ele vira o menor auto
            if (num[i] < menor){
                menor  = num[i];
            }
    //compara o valor, se o valor do vetor for menor do que o maior valor iterado no  loop, ele vira o maior auto
            if (num [i] > maior){
                maior = num[i];
            }

        }

        System.out.println(maior);
        System.out.println(menor);
    }

}
