package ExerciciosArray;

import java.util.Scanner;

public class exercicioArray_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int [10];
        int aux;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Insira o número que queira testar");
            numero [i] = sc.nextInt();
            aux = numero[i];
            int reversed = inverteNum(aux);

            if (numero[i] == reversed){
                System.out.println("É");
            } else {
                System.out.println("Não é");
            }
        }

    }


    static int inverteNum(int aux){
        int invert_cont = 0;

        while (aux > 0){
            invert_cont = invert_cont * 10 + aux % 10;
            aux = aux / 10;
        }
        return invert_cont;
    }


}
