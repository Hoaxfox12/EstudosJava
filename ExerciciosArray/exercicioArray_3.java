package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num [] = new double[18];
        double num2[] = new double[num.length];

        for (int i = 0; i < num.length; i++){
            System.out.println("Insira o número  :" + (i+1) +  "  do array  " );
            num[i] = sc.nextDouble();
            num2[i] = num[i] * num[i];
        }

        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        } System.out.println();

        for (int i = 0; i < num2.length; i++){
            System.out.print(num2[i] + " ");
        }System.out.println();

    }
}
