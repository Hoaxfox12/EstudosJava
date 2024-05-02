package exercicioClasseAbstrata.imple;

public class contaEmpresa extends ContaBanco{
    public contaEmpresa(Integer number, String holder, Double balance, Double taxaRendimento) {
        super(number, holder, balance);
        this.taxaRendimento = taxaRendimento;
    }

    private Double taxaRendimento;

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

   public double atualizaConta(){
        double aux = 0.00;

        aux = taxaRendimento * balance;

        return aux;
   }
}
