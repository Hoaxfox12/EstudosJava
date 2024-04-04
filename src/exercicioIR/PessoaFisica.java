package exercicioIR;

public class PessoaFisica extends  Pessoa{
    private double rendaCPF;
    private String cpf;



    public PessoaFisica(String nome, String telefone, String cpf, double rendaCPF) {
        super(nome, telefone);
        this.rendaCPF = rendaCPF;
        this.cpf = cpf;
    }

    public double getRendaCPF() {
        return rendaCPF;
    }

    public void setRendaCPF(double rendaCPF) {
        this.rendaCPF = rendaCPF;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double calculoIRPessoaFisica () {
        double basecalculo = this.rendaCPF;
        double aux = 0;

        if (basecalculo <= 1400){
            aux = basecalculo;
        } else if ( basecalculo <= 2100) {
            aux = basecalculo * 0.10;
        } else if ( basecalculo <= 2800) {
            aux = basecalculo * 0.15;
        } else if (basecalculo <= 3600) {
            aux = basecalculo * 0.20;
        } else {
            aux = basecalculo * 0.30;
        }

        return aux;
    }
}
