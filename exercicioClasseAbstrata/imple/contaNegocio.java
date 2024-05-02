package exercicioClasseAbstrata.imple;

public  class  contaNegocio extends ContaBanco {

    private Double limiteEmprestimo;

    public contaNegocio() {

    }

    public contaNegocio(Integer number, String holder, Double balance, Double limiteEmprestimo) {
        super(number, holder, balance);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo (double Amount){
        if (limiteEmprestimo <= Amount){
            balance -= Amount - 10.0;
        }
    }
}
