package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_Finale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int [] num2 = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i+1) + " Digito do array");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                num2[i] = 1;
                System.out.println("Numero impar foi digitado, virou 1");
            } else {
                num2[i] = 0;
                System.out.println("Numero par foi digitado, virou 0");
            }
        }

        for (int i = 0; i < num2.length; i++) {
            System.out.println(" " + num2[i]);
        }
    }
}
