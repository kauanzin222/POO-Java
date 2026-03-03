
import java.util.Scanner;

/**
 * @author vania
 */
public class Aplic {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida do raio: ");
        circulo.setRaio(entrada.nextDouble());

        boolean saidaMenu = false;
        while (!saidaMenu) {
            System.out.println("---\tMenu\n\t1. Consultar Área\n\t2. Consultar Perímetro\n\t3. Consultar Diâmetro\n\t4. Sair\n---");

            System.out.print("Digite a opção: ");
            int opcaoMenu = entrada.nextInt();
            entrada.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.printf("\n\n---\tMedida da área do Círculo: %.2f\n", circulo.calcArea());
                    break;
                case 2:
                    System.out.printf("\n\n---\tMedida do perímetro do Círculo: %.2f\n", circulo.calcPerimetro());
                    break;
                case 3:
                    System.out.printf("\n\n---\tMedida do diâmetro do Círculo: %.2f\n", circulo.calcDiametro());
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
