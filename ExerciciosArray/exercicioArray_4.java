package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] num = new double[5];
        double [] num2 = new double[num.length];

        for (int i = 0; i < num.length; i++){
            System.out.println("NUMERO" + (i+1) + "DO ARRAY");
            num[i] = sc.nextDouble();
            num2[i] = Math.sqrt(num[i]);
        }

        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < num2.length; i++){
            System.out.print(num2[i] + "  ");
        }  System.out.println();
    }
}
