package exercicioIR;


import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do cliente");//loop para iterar pessoas, usar para terminar o exercício
            String nome = sc.nextLine();
            System.out.println("Digite o telefone do cliente");
            String telefone = sc.nextLine();
            System.out.println("Digite a renda bruta do cliente/faturamento da empresa");
            double renda = sc.nextDouble();
            sc.nextLine();
            System.out.println("Digite o CPF/CNPJ do cliente");
            String cpf = sc.nextLine();

            PessoaFisica pessoaFisica = new PessoaFisica(nome, telefone, cpf, renda);
            pessoas.add(pessoaFisica);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do cliente");
            String nome = sc.nextLine();
            System.out.println("Digite o telefone do cliente");
            String telefone = sc.nextLine();
            System.out.println("Digite a renda bruta do cliente/faturamento da empresa");
            double renda = sc.nextDouble();
            sc.nextLine();
            System.out.println("Digite o CPF/CNPJ do cliente");
            String cnpj = sc.nextLine();

            PessoaJuridica cpnjJuridico = new PessoaJuridica(nome, telefone, cnpj, renda);
            pessoas.add(cpnjJuridico);

        }


        for (Pessoa pessoa : pessoas) {
            System.out.println("nome " + pessoa.getNome());
            System.out.println("Tele " + pessoa.getTelefone());
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
                System.out.println("Renda da pessoa física: " + pessoaFisica.getRendaCPF());
                System.out.println("CPF: " + pessoaFisica.getCpf());
                System.out.println("Imposto pago pela empresa/CPF " + pessoaFisica.calculoIRPessoaFisica());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
                System.out.println("Renda bruta da pessoa jurídica: " + pessoaJuridica.getRendaBruta());
                System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
                System.out.println("Imposto pago pela empresa/CPF " + pessoaJuridica.calculoIRPessoaJuridica() );
            }
            System.out.println("--------------------");
        }



    }

}
