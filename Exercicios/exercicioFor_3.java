package Exercicios;

import java.util.Scanner;

public class exercicioFor_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt(); /*Recebe o fatorial a ser calculado */
        int fatorial = 1; /* é iniciado em 1 pois é impossível ter fatorial de 0*/

        for (int i = 1; i <= fact; i++){ /* uma variável i é inicializada em 1, ela deve ser menor or igual ao fatorial */
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
