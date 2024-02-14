package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int [] num2 = new int[num.length];

        for (int i = 0; i < num.length ; i++) {
            System.out.println("Digite a posição " + i + " do array");
            num[i] = sc.nextInt();
        }
            // inteiro i recebe tamanho do num-1 e há decrescimo na contagem do array
        // array num2 recebe o valor de num, porem invertido (num.length - 1 - i garante que receba as posições certas)
        for (int i = num.length-1; i >= 0 ; i--) {
            num2[num.length - 1 - i] = num[i];

        }
        for (int i = 0; i < num2.length; i++){
            System.out.print(num2[i] + "  ");
        }


    }
}
