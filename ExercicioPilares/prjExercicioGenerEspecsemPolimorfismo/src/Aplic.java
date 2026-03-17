
import fatec.poo.models.Cliente;
import fatec.poo.models.Instrutor;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- DADOS DO INSTRUTOR");
        System.out.print("Informe o ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Informe o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Informe o telefone: ");
        String telefone = entrada.nextLine();

        Instrutor instrutor = new Instrutor(id, nome, telefone);
        
        System.out.print("Informe a área de atuação: ");
        instrutor.setAreaAtuacao(entrada.nextLine());
      
        System.out.println("\n---- DADOS DO CLIENTE");
        System.out.print("Informe o CPF: ");
        String cpf = entrada.nextLine();
        System.out.print("Informe o nome: ");
        nome = entrada.nextLine();
        System.out.print("Informe o telefone: ");
        telefone = entrada.nextLine();

        Cliente cliente = new Cliente(cpf, nome, telefone);
        
        System.out.print("Informe o peso: ");
        cliente.setPeso(entrada.nextDouble());
        System.out.print("informe a altura: ");
        cliente.setAltura(entrada.nextDouble());
            
        System.out.println("\n---\tREVISÃO DADOS DO INSTRUTOR");
        System.out.println("---\tID e Nome do Instrutor: ");
        System.out.println("---\t" + instrutor.getIdentificacao() + " | " + instrutor.getNome());
        System.out.println("---\tTelefone do Intrutor: " + instrutor.getTelefone());
        System.out.println("---\tÁrea de Atuação: " + instrutor.getAreaAtuacao());
        
        System.out.println("\n---\tREVISÃO DADOS DO CLIENTE");
        System.out.println("----\tCPF e Nome do Cliente: ");
        System.out.println("---\t" + cliente.getCpf() + " | " + cliente.getNome());
        System.out.println("---\tTelefone do Cliente: " + cliente.getTelefone());
        System.out.printf("---\tPeso: %.2f\tAltura: %.2f\n", cliente.getPeso(), cliente.getAltura());
    }

}
