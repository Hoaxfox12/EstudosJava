package Exercicios;

import java.util.Scanner;

public class exercicioFor_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idades;
        int num;
        int medias = 0;
        int aux = 0;

        System.out.println("Digite a quantidade de pessoas no grupo");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++ ){
            System.out.println("Digite a idade das pessoas do grupo" + i +  " :  ");
            idades = sc.nextInt();
            medias += idades;
            aux = medias/num;
        }
        System.out.println(aux);

        if (aux < 25){
            System.out.println("Seu grupo é jovem");
        } else if (aux > 25 && aux < 45){
            System.out.println("Seu grupo é de adultos");
        } else {
            System.out.println("Seu grupo é de idosos");
        }


    }
}
