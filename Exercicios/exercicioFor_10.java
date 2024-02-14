package Exercicios;


import java.util.Scanner;
public class exercicioFor_10 {
    public static void main(String[] args) {
        double num;
        String soma = "";
        double preco;
        int i;
        double total;
        Scanner sc= new Scanner(System.in);
        int enab;

        do {
            System.out.println("CAIXA");
            num = sc.nextInt();

            total = 0;
            for (i = 1; i <= num; i++){
                System.out.println("Digite o preço dos produtos");
                preco = sc.nextInt();
                total += preco;
                soma += "Produto" + i + "  Preço em R$:  " + preco;

            }

            System.out.println(total);
            System.out.println(soma);

            System.out.println("Deseja rodar novamente? 1 = Não/ 2 = Continua");
            enab = sc.nextInt();

        } while (enab != 1);

        }

    }

