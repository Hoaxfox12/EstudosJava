package Exercicios;

import java.util.Scanner;

public class exercicioFor_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int aux = 0;
        int par = 0;

        for (int i = 1; i <= num; i++){
                if(i%2==0){
                    System.out.print(i + "par");
                    aux ++;
                } else {
                    System.out.print( "impar");
                }

            }
        System.out.println(aux);
        }
}
