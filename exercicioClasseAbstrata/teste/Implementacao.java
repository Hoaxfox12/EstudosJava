package exercicioClasseAbstrata.teste;

import exercicioClasseAbstrata.imple.ContaBanco;
import exercicioClasseAbstrata.imple.contaEmpresa;
import exercicioClasseAbstrata.imple.contaNegocio;

import java.util.ArrayList;
import java.util.List;

// Implementação de classes abstratas, classe abstratas são bons para reuso de variaveis
// Também serve para poliformismo, onde vocÊ pode todos os tipos de conta em uma mesma coleção "contaNegocio"
// e "contaEmpresa" dentro do ContaBanco
public class Implementacao {
    public static void main(String[] args) {
        List<ContaBanco> list = new ArrayList<>();
        list.add(new contaNegocio(24, "Gustavo", 2454.24, 500.00));
        list.add(new contaEmpresa(25, "João", 4324.22, 0.02));
        list.add(new contaNegocio(26, "Gustavo Santosa", 1000.00, 100.00));
        list.add(new contaEmpresa(27, "João Santos", 324.22, 0.05));


        double sum = 0.00;

        for(ContaBanco x : list){
            sum += x.getBalance();
        }

        System.out.printf("Balanço total é de %.2f%n", sum);

    }

}