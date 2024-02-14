package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] num = new double[4];
        double[] num2 = new double[num.length];

        for (int i = 0; i < num.length; i++) {
            System.out.println("insira o número " + (i+1));
            num[i] = sc.nextInt();
            num2[i] = num[i];
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i] + " ");
        }System.out.println();
    }
}