public class ProfessorHorista extends Professor {

    private int horasTrabalhadas;

    private double valorHora;

    public ProfessorHorista(String nome, String regimePgto, int horasTrabalhadas, double valorHora) {
        super(nome, regimePgto);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularValorAReceber() {
        return horasTrabalhadas * valorHora;
    }
}
