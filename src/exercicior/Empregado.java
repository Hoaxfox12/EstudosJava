package exercicior;

public class Empregado {
    private String nome;
    private Integer horas;
    private double valorPorHora;

    public Empregado(String nome, Integer horas, double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){

        return horas * valorPorHora;
    }

    @Override
    public String toString() {
        return "Empregados{" +
                "nome='" + nome + '\'' +
                ", horas=" + horas +
                ", valorPorHora=" + valorPorHora +
                '}';
    }
}
