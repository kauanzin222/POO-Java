
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println("Digite a unidade de medida:");
        String unidade = entrada.next();

        Retangulo objRet = new Retangulo(unidade);

        System.out.println("Digite a medida da altura:");
        double alt = entrada.nextDouble();
        objRet.setAltura(alt);

        System.out.println("Digite a medida da base:");
        double bas = entrada.nextDouble();
        objRet.setBase(bas);

        do {
            System.out.println("Digite a tarefa a se fazer:");
            System.out.println("1-Descubra a area:");
            System.out.println("2-Descubra o perimetro:");
            System.out.println("3-Descubara o tamanho da diagonal");
            System.out.println("4-Sair");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1: {
                    System.out.println("Medida da area do retangulo: " + objRet.calcArea() + " " + objRet.getUnidadeMedida());
                    break;
                }

                case 2: {
                    System.out.println("Medida do perimetro do retangulo: " + objRet.calcPerimetro() + " " + objRet.getUnidadeMedida());
                    break;
                }

                case 3: {
                    System.out.println("Medida do tamanho da diagonal do retangulo: " + objRet.calcDiagonal() + " " + objRet.getUnidadeMedida());
                    break;
                }

                case 4: {
                    System.out.println("Fechando aplicação");
                    System.out.println(".");
                    System.out.println("..");
                    System.out.println("...");
                    break;
                }

                default: {
                    System.out.println("Numero incorreto");
                }
            }
        } while (opcao < 4 && opcao > 0);
    }
}
