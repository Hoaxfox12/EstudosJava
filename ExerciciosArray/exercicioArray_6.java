package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite a opção que deseja ");
        System.out.println(" SOMA DE 2 ARRAYS NUM TERCEIRO ARRAY : 1 ");
        System.out.println("  MULTIPLICAÇÃO DE 2 ARRAYS NUM TERCEIRO ARRAY : 2 ");
        System.out.println("   Divisão DE 2 ARRAYS NUM TERCEIRO ARRAY: 3   ");
        System.out.println(" SUBTRAÇÃO DE 2 ARRAYS NUM TERCEIRO ARRAY : 4  ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                arraySoma();
                break;
            case 2:
                arrayMult();
                break;
            case 3:
                arrayDivi();
                break;
            case 4:
                arraySub();
        }
    }

    private static void arraySub() {
        int[] num = new int[10];
        int[] num2 = new int[num.length];
        int[] num3 = new int[num.length];
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < num.length; i++){
            System.out.println(" Digite o " + (i +1) + " Dígito do array ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num2.length; i++){
            System.out.println(" Digite o " + (i +1) + " Dígito do array 2");
            num2 [i] = sc.nextInt();
            num3[i] = num[i] - num2[i];
        }


        for (int j : num) {
            System.out.println(j + " ");
        }
        System.out.println();

        for (int i = 1; i < num2.length; i++){
            System.out.println(num2[i] + " ");
        }System.out.println();
        for (int i = 1; i < num3.length; i++){
            System.out.println(num3[i] + " ");
        }System.out.println();

    }

    private static void arraySoma(){
    int[] num = new int[10];
    int[] num2 = new int[num.length];
    int[] num3 = new int[num.length];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < num.length; i++){
        System.out.println(" Digite o " + i + " Dígito do array ");
        num[i] = sc.nextInt();

    }

    for (int i = 0; i < num2.length; i++){
        System.out.println(" Digite o " + (i +1) + " Dígito do array 2");
        num2 [i] = sc.nextInt();
        num3[i] = num[i] + num2[i];
        }

        for (int j : num) {
            System.out.println(j + " ");
        }
        System.out.println();

        for (int j : num2) {
            System.out.println(j + " ");
        }
        System.out.println();
        for (int j : num3) {
            System.out.println(j + " ");
        }
        System.out.println();

}

    private static void arrayMult(){
        int[] num = new int[10];
        int[] num2 = new int[num.length];
        int[] num3 = new int[num.length];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            System.out.println(" Digite o " + i + " Dígito do array ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num2.length; i++){
            System.out.println(" Digite o " + (i +1) + " Dígito do array 2");
            num2 [i] = sc.nextInt();
            num3[i] = num[i] * num2[i];
        }

        for (int j : num) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int j : num2) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j : num3) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
    private static void arrayDivi(){
        float [] num = new float[10];
        float[] num2 = new float[num.length];
        float[] num3 = new float[num.length];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            System.out.println(" Digite o " + i + " Dígito do array ");
            num[i] = sc.nextFloat();
        }

        for (int i = 0; i < num2.length; i++){
            System.out.println(" Digite o " + (i +1) + " Dígito do array 2");
            num2 [i] = sc.nextInt();
            num3[i] = num[i] / num2[i];
        }

        for (float v : num) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (float v : num2) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (float v : num3) {
            System.out.print(v + " ");
        }
        System.out.println();

    }


}


