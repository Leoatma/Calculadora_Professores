public class ProfessorPJ extends Professor {

    private double valorContrato;

    public ProfessorPJ(String nome, String regimePgto, double valorContrato) {
        super(nome, regimePgto);
        this.valorContrato = valorContrato;
    }


    @Override
    public double calcularValorAReceber() {
        return valorContrato;
    }

}
