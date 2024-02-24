package ExerciciosMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosMatriz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] matriz = new String[31][24];
        boolean sair = false;
        byte opção;
        int dia = 0;
        int hora = 0;

        while (!sair){
            System.out.println("Opção 1 para adicionar compromisso");
            System.out.println("Opção 2 para verificar compromisso");
            System.out.println("Opção 0 para sair");

            opção = sc.nextByte();

            if (opção == 1){
                boolean verificadia = false;

                while (!verificadia){
                    System.out.println("Digite o dia do mês");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31){
                        verificadia =  true;
                    } else {
                        System.out.println("Dia inválido");
                    }
                }

                boolean verificahora = false;
                while (!verificahora){
                    System.out.println("Digite a hora");
                    hora = sc.nextInt();
                    if (hora >= 0 && hora <=24){
                        verificahora =  true;
                    } else {
                        System.out.println("hora inválido");
                    }
                }

                dia--;
                hora--;

                matriz[dia][hora] = sc.next();

            } else if (opção == 2){
                System.out.println("Digite o dia");
                int verificaODia = sc.nextInt();
                System.out.println("Digite a hora");
                int verificaAHora = sc.nextInt();

                verificaODia--;
                verificaAHora--;

                String verify = matriz[verificaODia][verificaAHora];

                if (verify != null){
                    System.out.println("compromisso do dia é " + verify);
                } else {
                    System.out.println("Não há compromissos");
                }
            } else {
                break;
            }

        }



    }


}

