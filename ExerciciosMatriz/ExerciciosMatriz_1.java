package ExerciciosMatriz;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosMatriz_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowIndex = 6;
        int colIndex = 6;

        int[][] matriz = new int[rowIndex][colIndex];

        populaMatrix(sc, matriz, rowIndex, colIndex);
        auxMatrix1(matriz, rowIndex, colIndex);
        auxMatrix2(matriz, rowIndex, colIndex);
        exibeMatrix(matriz, rowIndex, colIndex);
    }


    private static void populaMatrix(Scanner sc, int[][] matriz, int rowIndex, int colIndex) {
        Random random = new Random();
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < colIndex; j++) {
                matriz[i][j] = random.nextInt(15);
            }
        }
    }

    private static void auxMatrix1(int[][] matriz, int rowIndex, int colIndex) {
        int auxmaior = 0;
        int colunachecar = 4;

        for (int j = 0; j < colIndex; j++) {
            if (matriz[colunachecar][j] > auxmaior) {
                auxmaior = matriz[colunachecar][j];
            }
        }
        System.out.println("O número da coluna 5 de maior valor é " + auxmaior);
    }
    private static void auxMatrix2(int[][] matriz, int rowIndex, int colIndex) {
        int maioraux = 0;
        int linhachecar = 5;

        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < colIndex; j++){
                if (matriz [linhachecar][j]  > maioraux){
                    maioraux = matriz[linhachecar][j];
                     }
                 }
            }
            System.out.println("O número da fileira 6 de maior valor é "  +  maioraux);
        }



    private static void exibeMatrix(int[][] matriz, int rowIndex, int colIndex) {
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < colIndex; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }
    }
}