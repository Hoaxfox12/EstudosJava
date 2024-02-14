package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        int [] num = new int[10];

        for(int i = 0; i < num.length; i++){
            System.out.println("Digite o número");
            num[i] = sc.nextInt();
            aux += num[i];
        }

        System.out.println(aux);
    }
}
