package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int aux = 0;

        for (int i = 0; i < num.length ;i++ ){
            System.out.println(" Digite o " + (i + 1 ) + " Dígito do array ");
            num [i] = sc.nextInt();

        }
        for (int i = 0; i < num.length ;i++ ){
           if (num[i] % 2 == 0){
               System.out.println( num [i] +  " é par");
           } else{
               System.out.println(num [i] + " é impar");
           }
        }

    }
}
