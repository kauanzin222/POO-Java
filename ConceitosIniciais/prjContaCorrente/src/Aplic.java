
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o saldo da conta R$");
        double saldo = entrada.nextDouble();

        ContaCorrente conta = new ContaCorrente(numero, saldo);

        boolean saidaMenu = false;
        while (!saidaMenu) {
            System.out.println("---\tMenu\n\t1- Depositar\n\t2- Sacar\n\t3- Consultar Saldo\n\t4- Sair\n---");

            System.out.print("Digite a opção: ");
            int opcaoMenu = entrada.nextInt();
            entrada.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n---\tNúmero da Conta: " + conta.getNumero());
                    System.out.print("---\tDigite o valor a depositar R$");
                    conta.depositar(entrada.nextDouble());
                    System.out.println("\n\n---\tDepósito concluído!");
                    break;
                case 2:
                    System.out.println("\n---\tNúmero da Conta: " + conta.getNumero());
                    System.out.print("---\tDigite o valor a sacar R$");
                    double saque = entrada.nextDouble();

                    if (saque < conta.getSaldo()) {
                        conta.sacar(saque);
                        System.out.println("\n\n---\tSaque concluído!");
                    } else {
                        System.out.println("---\tSaldo insuficiente para saque!");
                    }
                    break;
                case 3:
                    System.out.println("\n---\tNúmero da Conta: " + conta.getNumero());
                    System.out.println("---\tSaldo R$" +conta.getSaldo());
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
