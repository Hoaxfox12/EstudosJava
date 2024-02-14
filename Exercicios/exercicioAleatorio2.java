package Exercicios;

import java.util.Scanner;

public class exercicioAleatorio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, centena, dezena, unidade;

        System.out.println("Digite o número");
        num = scan.nextInt();
        centena = num /100; /* Divide o número e tira sua centena */
        dezena = (num % 100) / 10; /* divide o resto da divisão da centena e arredonda */
        unidade =  num % 10; /* faz a divisão do resto por 10 */

        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);
    }
}
