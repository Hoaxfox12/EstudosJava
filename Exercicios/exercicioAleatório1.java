package Exercicios;

import java.util.Scanner;

public class exercicioAleatório1 {
    public static void main(String[] args) {
        double latas3_6, latas18, calcTinta, preco18, preco3_6;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de metros deseja pintar");
        double Metrospintura = scan.nextDouble();

        calcTinta = Math.ceil(Metrospintura * 6) ;
        latas18 = Math.ceil(calcTinta / 18);
        latas3_6 = Math.ceil(calcTinta / 3.6);

        preco18 = latas18 * 80.50;
        preco3_6 = latas3_6 * 14.25;



        System.out.println(calcTinta);
        System.out.println(latas18);
       System.out.println(latas3_6);
        System.out.println(preco18);
        System.out.println(preco3_6);

    }
}
