package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioLista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empregados> empregados = new ArrayList<>();
        System.out.println("Insira a quantidade de funcionáriso");
        int n = scanner.nextInt();

        scanner.nextLine();
        String empNome = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o ID do empregado"); //iteração padrão
            int idEmp = scanner.nextInt();
            scanner.nextLine();
            System.out.println("-------------------");
            System.out.println("Insira o nome");
            empNome = scanner.nextLine();
            System.out.println("-------------------");
            System.out.println("Insira o Salário");
            double salEmp = scanner.nextDouble();

            Empregados emp = new Empregados(empNome, idEmp, salEmp);
            empregados.add(emp);
        }


        System.out.println("Insira o ID do funcionário que deseja fazer o aumento de salário");
        int pegaId = scanner.nextInt();

        Empregados achaEmpregado = empregados.stream().filter(e -> e.getId() == pegaId).findFirst().orElse(null);

        if (achaEmpregado != null){
            System.out.println("Insira o aumento do funcionário selecionado");
            double icrSalario = scanner.nextDouble();
            scanner.nextLine();
            achaEmpregado.AumentoSalario(icrSalario);
        } else{
            System.out.println("o ID do funcionário não existe");
        }


        for (Empregados x : empregados){
            System.out.println(x.toString());
        }

    }
}
