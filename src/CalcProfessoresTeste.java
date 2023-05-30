
import java.util.Scanner;

public class CalcProfessoresTeste {
    public static void main(String[] args) {

        Scanner tecladoIN = new Scanner(System.in);

        System.out.println("\n----- Olá, bem vindo ao APP Calculadora dos Professores -----\n");

        String nomeProf = lerNomeProfessor(tecladoIN);

        realizarCalculoRemuneraçao(lerRegimeTrabalho(tecladoIN), tecladoIN, nomeProf);
        tecladoIN.close();

    }

    public static String lerNomeProfessor(Scanner scanner) {

        System.out.println("Para começar, digite o nome do professor: ");
        return scanner.nextLine();
    }

    public static int lerRegimeTrabalho(Scanner scanner) {

        System.out.println("""
                Informe agora o regime de trabalho deste professor:
                    CLT - digite 1;
                    Horista - Digite 2;
                    PJ - Digite 3; \n
                    Digite 0 para sair.
                    """);
        return scanner.nextInt();
    }

    public static void realizarCalculoRemuneraçao(int regimeInformado, Scanner scanner, String nomeProfessor) {

        if (regimeInformado == 0) {

            System.out.println("\n ----- PROGRAMA ENCERRADO ------\n");

        } else {

            switch (regimeInformado) {

                case 1:
                    System.out.println("Informe o salario mensal do professor: ");
                    double salario = scanner.nextDouble();

                    ProfessorCLT profCLT = new ProfessorCLT(nomeProfessor, "CLT", salario);
                    System.out.println(profCLT); // criado metodo toStringna classe abstrata 'Professor', para imprimir
                                                 // nome e valor
                    break;

                case 2:
                    System.out.println("Informe o número de horas trabalhadas no mês: ");
                    int horas = scanner.nextInt();

                    System.out.println("Qual o valor da hora trabalhada? ");
                    double valorHora = scanner.nextDouble();

                    ProfessorHorista profHorista = new ProfessorHorista(nomeProfessor, "Horista", horas, valorHora);
                    System.out.println(profHorista);
                    break;

                case 3:
                    System.out.println("Qual o valor do contrato deste professor? ");
                    double valorContrato = scanner.nextDouble();

                    ProfessorPJ professorPJ = new ProfessorPJ(nomeProfessor, "PJ", valorContrato);
                    System.out.println(professorPJ);
                    break;

                default:
                    System.out.println("Valor inserido inválido. Tente novamente.");
            }
        }
    }

}
