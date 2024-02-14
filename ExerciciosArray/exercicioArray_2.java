package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[9];
        double[] array2 = new double[array.length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Insira o número  "  +  i);
            array [i] = sc.nextInt();
            array2[i] = array[i] * 2;
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }
}


