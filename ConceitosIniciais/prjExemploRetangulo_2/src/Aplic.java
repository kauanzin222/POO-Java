
import java.util.Scanner;

/**
 * @author 0030482421022
 */
public class Aplic {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida da altura: ");
        retangulo.setAltura(entrada.nextDouble());

        System.out.print("Digite a medida da base: ");
        retangulo.setBase(entrada.nextDouble());

        boolean saidaMenu = false;
        while (!saidaMenu) {
            System.out.println("---\tMenu\n\t1. Consultar Área\n\t2. Consultar Perímetro\n\t3. Consultar Diagonal\n\t4. Sair\n---");
            
            System.out.print("Digite a opção: ");
            int opcaoMenu = entrada.nextInt();
            entrada.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n\n---\tMedida da área do Retângulo: " + retangulo.calcArea());
                    break;
                case 2:
                    System.out.println("\n\n---\tMedida do perímetro do Retângulo: " + retangulo.calcPerimetro());
                    break;
                case 3:
                    System.out.printf("\n\n---\tMedida da diagonal do Retângulo: %.1f\n", retangulo.calcDiagonal());
                    break;
                case 4:
                    System.out.println("\n\n---\tEncerrando o programa...");
                    saidaMenu = true;
                    break;
                default:
                    System.out.println("\n---\tNúmero inválido. Tente novamente.");
                    break;
            }
        }

    }

}
