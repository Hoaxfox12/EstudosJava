package exercicioClasseAbstrata.imple;

public abstract class ContaBanco {

    private Integer number;
    private String holder;
    protected Double balance;

    public ContaBanco (){

    }
    public ContaBanco(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void saque (double Amount){
        balance -= Amount + 5.0;
    }

    public void deposito (double Amount){
        balance += Amount;
    }
}
