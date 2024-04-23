package exercicior;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<Empregado>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){

            System.out.println("Digite o nome do funcionário");
            String nome = sc.nextLine();
            System.out.println("O funcionário é tercerizado?");
            String tercerizado = sc.nextLine();
            System.out.println("Insira a jornada de trabalho:");
            Integer horas = sc.nextInt();
            System.out.println("Insira o valor da hora de trabalho:");
            Double vlrHoras = sc.nextDouble();
            if (tercerizado == "s"){
                System.out.println("Insira o valor do adicional de tercerizado");
                Double addTerc = sc.nextDouble();
                Empregado empregado = new Tercerizado(nome, horas, vlrHoras, addTerc);
                empregados.add(empregado);
            } else{
                Empregado empregado = new Empregado(nome, horas, vlrHoras);
                empregados.add(empregado);
            }


        }

    }
}
