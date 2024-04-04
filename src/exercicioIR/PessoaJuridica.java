package exercicioIR;

public class PessoaJuridica extends Pessoa {
    private  double rendaBruta;
    private  String cnpj;



    public PessoaJuridica(String nome, String telefone, String cnpj, double rendaBruta) {
        super(nome, telefone);
        this.rendaBruta = rendaBruta;
        this.cnpj = cnpj;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calculoIRPessoaJuridica(){
        double basecalculo = this.rendaBruta;

        return basecalculo * 0.10;
    }
}
