package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicioFor_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a população A, ela deve ser menor");
        double A = scan.nextDouble();
        System.out.println("Digite a população B, ela deve ser maior");
        double B = scan.nextDouble();
        System.out.println("Digite a taxa de crescimento da população A");
        double CrescA = scan.nextDouble();
        System.out.println("Digite a taxa de crescimento da população B");
        double CrescB = scan.nextDouble();

        double aux = 0;

        while (A < B){
             A += (A/100) * CrescA;
             B += (B/100) * CrescB  ;
            aux++;
        }


        System.out.print( aux );
    }
}
