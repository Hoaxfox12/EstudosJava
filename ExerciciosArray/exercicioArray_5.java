package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int [] num2 = new int[num.length];
        int [] num3 = new int[num.length];

        for (int i = 1; i < num.length; i++){
            System.out.println(" Digite o " + i + " Dígito do array ");
            num[i] = sc.nextInt();
            num2[i] = num[i];
            num3[i] = num[i] + num2[i];
        }

        for (int i = 1; i < num.length; i++){
            System.out.println(num[i] + " ");
        }System.out.println();

        for (int i = 1; i < num2.length; i++){
            System.out.println(num2[i] + " ");
        }System.out.println();
        for (int i = 1; i < num3.length; i++){
            System.out.println(num3[i] + " ");
        }System.out.println();
    }

}
