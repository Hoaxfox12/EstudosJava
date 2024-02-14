package Exercicios;
import java.util.Scanner;
public class sdggds {


    public static class testewhile {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            System.out.println("Entre com um número");
            num = sc.nextInt();

            int soma = calcularNumerosPrimos(num);
            System.out.println("Soma dos números primos até " + num + ": " + soma);
        }

        private static int calcularNumerosPrimos(int num) {
            boolean aux;
            int soma = 0;
            for (int i = 2; i <= num; i++) {
                aux = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        aux = false;
                        break;
                    }
                }

                if (aux) {
                    System.out.println("" + i);
                    soma += i;
                }
            }

            return soma;
        }
    }
}
