package exercicior;

public class Tercerizado extends Empregado {

    private Double TaxaAdicional;

    public Tercerizado(String nome, Integer horas, double valorPorHora, Double addTerc) {
        super(nome, horas, valorPorHora);
    }

    public Double getTaxaAdicional() {
        return TaxaAdicional;
    }

    public void setTaxaAdicional(Double taxaAdicional) {
        TaxaAdicional = taxaAdicional;
    }

    public double pagamentoTercerizado(){

        return pagamento() + this.TaxaAdicional;
    }
}
