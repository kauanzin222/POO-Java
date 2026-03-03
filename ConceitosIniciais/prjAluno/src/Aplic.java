
import java.util.Scanner;

/**
 * @author vania
 */
public class Aplic {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o RA do aluno: ");
        aluno.setRA(entrada.nextInt());
        entrada.nextLine();

        System.out.print("Digite a nota da 1º prova: ");
        aluno.setNtPrv1(entrada.nextDouble());
        System.out.print("Digite a nota da 2º prova: ");
        aluno.setNtPrv2(entrada.nextDouble());

        System.out.print("Digite a nota do 1º trabalho: ");
        aluno.setNtTrab1(entrada.nextDouble());
        System.out.print("Digite a nota do 2º trabalho: ");
        aluno.setNtTrab2(entrada.nextDouble());

        boolean saidaMenu = false;
        while (!saidaMenu) {
            System.out.println("---\tMenu Aluno " + aluno.getRA());
            System.out.println("1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");

            System.out.print("---\tDigite a opção: ");
            int opcaoMenu = entrada.nextInt();
            entrada.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n---\tNota das Provas");
                    System.out.println("1ª Prova: " + aluno.getNtPrv1());
                    System.out.println("2ª Prova: " + aluno.getNtPrv2());
                    System.out.println("---\tNota dos Trabalhos");
                    System.out.println("1º Trabalho: " + aluno.getNtTrab1());
                    System.out.println("2º Trabalho: " + aluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("\n--- Média das Provas: " + aluno.calcMediaProva());
                    System.out.println("--- Média dos Trabalhos: " + aluno.calcMediaTrab());
                    break;
                case 3:
                    System.out.println("\n--- Média Final: " + aluno.calcMediaFinal());
                    break;
                case 4:
                    System.out.println("\n\n---\tEncerrando o programa...");
                    saidaMenu = true;
                    break;
                default:
                    System.out.println("\n---\tOpção inválida. Tente novamente.");
                    break;
            }
        }
    }

}
