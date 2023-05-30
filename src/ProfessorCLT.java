public class ProfessorCLT extends Professor {

    private double salarioMensal;
    

    public ProfessorCLT(String nome, String regimePGTO, double salarioMensal) {
        super(nome, regimePGTO);
        this.salarioMensal = salarioMensal;
    }    

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularValorAReceber() {
        return salarioMensal;
    }
}