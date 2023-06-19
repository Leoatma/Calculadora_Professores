
public abstract class Professor {

    private String nome;
    private String regimePgto;

    public Professor() {
    }

    public Professor(String nome, String regimePgto) {
        this.nome = nome;
        this.regimePgto = regimePgto;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularValorAReceber();

    @Override
    public String toString() {
        return "Professor " + this.getNome() + ", Valor a Receber = R$" + this.calcularValorAReceber() + "\n";
    }
}
