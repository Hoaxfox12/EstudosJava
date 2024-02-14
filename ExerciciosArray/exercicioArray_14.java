package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] num2 = new int[num.length];
        int[] num3 = new int[num.length];
        int aux = 0;
        int aux1 = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite a posição " + (i + 1) + " do array");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num2[i] = num[i];
                aux = num2[i];
                System.out.println(aux);
            }

        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0 ){
                num3[i] = num[i];
                aux1 = num3[i];
                System.out.println(aux1);
            }
        }
    }
}
