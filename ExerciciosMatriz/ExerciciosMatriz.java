package ExerciciosMatriz;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digte o tamanho da linha");

        int rowIndex = sc.nextInt();

        System.out.println("Digte o tamanho da coluna");

        int colIndex = sc.nextInt();

        int[][] notas = new int[rowIndex][colIndex];

        povoaMatrix(sc, notas, rowIndex, colIndex);
        printaMatrix(notas, rowIndex, colIndex);
        maiorMatrix(notas, rowIndex, colIndex);
        menorMatrix(notas, rowIndex, colIndex);
    }



    public static void povoaMatrix(Scanner sc, int[][] notas, int rowIndex, int colIndex) {
        Random random = new Random();
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < colIndex; j++) {
                notas[i][j] = random.nextInt(90);
            }
        }
    }

    public static void printaMatrix(int[][] notas, int rowIndex, int colIndex) {
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < colIndex; j++) {

                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void maiorMatrix(int[][] notas, int rowIndex, int colIndex) {
        int auxMaior = 0;
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < colIndex; j++) {
                if (notas[i][j] < auxMaior){
                    auxMaior = notas[i][j];
                }
            }
        }
        System.out.println(" O maior número dentro do array é o número: " + auxMaior);
    }
    private static void menorMatrix(int[][] notas, int rowIndex, int colIndex) {
        int auxMenor = 0;
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < colIndex; j++) {
                if (notas[i][j] > auxMenor){
                    auxMenor = notas[i][j];
                }
            }
        }
        System.out.println(" O menor número dentro do array é o número: " + auxMenor);
    }
}