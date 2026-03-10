
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String situacao;

        System.out.print("Digite o número de identificação do livro: ");
        int identificacao = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o título do livro: ");
        String titulo = entrada.next();

        Livro livro = new Livro(identificacao, titulo);

        System.out.print("Defina o valor da multa diária R$");
        livro.setValMultaDiaria(entrada.nextDouble());

        boolean saidaMenu = false;
        while (!saidaMenu) {
            System.out.println("---\tMenu\n\t1- Consultar livro\n\t2- Emprestar livro\n\t3- Devolver livro\n\t4- Sair\n---");

            System.out.print("Digite a opção: ");
            int opcaoMenu = entrada.nextInt();
            entrada.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n---\tNúmero de Identificação: " + livro.getIdentificacao());
                    System.out.println("---\tTítulo: " + livro.getTitulo());

                    situacao = livro.getSituacao() ? "Emprestado" : "Disponível";
                    System.out.println("---\tSituação: " + situacao);
                    break;
                case 2:
                    if (livro.getSituacao()) {
                        System.out.println("\n---\tO livro está emprestado.");
                    } else {
                        livro.emprestar();
                        System.out.println("\n---\tOperação de empréstimo realizada com sucesso.");
                    }
                    break;
                case 3:
                    if (livro.getSituacao()) {
                        System.out.print("\n---\tDigite os dias de atraso: ");
                        int diasAtraso = entrada.nextInt();

                        System.out.println("\n---\tOperação de devolução realizada com sucesso.");
                        if (diasAtraso > 0) {
                            System.out.printf("---\tValor da multa R$%.2f\n", livro.devolver(diasAtraso));
                        }
                    } else {
                        System.out.println("\n---\tO livro já está disponível.");
                    }
                    break;
                case 4:
                    System.out.println("\n---\tEncerrando o programa...");
                    saidaMenu = true;
                    break;
                default:
                    System.out.println("\n---\tOpção inválida. Tente novamente.");
                    break;
            }
        }
    }

}
