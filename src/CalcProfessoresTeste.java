
import java.util.Scanner;

public class CalcProfessoresTeste {
    public static void main(String[] args) {

        
        System.out.println("\n----- Olá, bem vindo ao APP Calculadora dos Professores -----\n");
        
        realizarCalculoRemuneraçao();
        
        
    }
    
    public static void realizarCalculoRemuneraçao() {

        Scanner tecladoIN = new Scanner(System.in);
        System.out.println("Para começar, digite o nome do professor: ");
        String nomeProfessor = tecladoIN.nextLine();

        System.out.println("""
            Informe agora o regime de trabalho deste professor: 
                CLT - digite 1;
                Horista - Digite 2;
                PJ - Digite 3; \n
                Digite 0 para sair.
                """);
        int regimeInformado = tecladoIN.nextInt();

        if (regimeInformado == 0) {

            System.out.println("\n ----- PROGRAMA ENCERRADO ------\n");

        } else {

            switch(regimeInformado) {

                case 1:
                System.out.println("Informe o salario mensal do professor: ");
                double salario = tecladoIN.nextDouble();
                
                ProfessorCLT profCLT = new ProfessorCLT(nomeProfessor, "CLT", salario);
                System.out.println(profCLT);
                break;
    
                case 2:
                System.out.println("Informe o número de horas trabalhadas no mês: ");
                int horas = tecladoIN.nextInt();
    
                System.out.println("Qual o valor da hora trabalhada? ");
                double valorHora = tecladoIN.nextDouble();
    
                ProfessorHorista profHorista = new ProfessorHorista(nomeProfessor, "Horista", horas, valorHora);
                System.out.println(profHorista);
                break;
    
                case 3:
                System.out.println("Qual o valor do contrato deste professor? ");
                double valorContrato = tecladoIN.nextDouble();
    
                ProfessorPJ professorPJ = new ProfessorPJ(nomeProfessor, "PJ", valorContrato);
                System.out.println(professorPJ);
                break;
    
                default: 
                System.out.println("Valor inserido inválido. Tente novamente.");
            }         
            
        }

        tecladoIN.close();       
    }
    
}
