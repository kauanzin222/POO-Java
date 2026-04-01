
import fatec.poo.models.Pessoa;
import fatec.poo.models.PessoaFisica;
import fatec.poo.models.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int qntdPes = sc.nextInt();
        sc.nextLine();

        List<Pessoa> list = new ArrayList<>();

        for (int i = 0; i < qntdPes; i++) {
            System.out.println("\n---\tDados Gerais da Pessoa #" + (i + 1));
            System.out.print("Pessoa Física ou Jurídica (f/j)? ");
            char opc = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Ano de Inscrição (yyyy): ");
            Integer ano = sc.nextInt();
            sc.nextLine();
            System.out.print("Total de Compras R$");
            Double compras = sc.nextDouble();
            sc.nextLine();
            
            switch (opc) {
                case 'f': 
                    System.out.print("CPF: ");
                    String cpf = sc.next();
                    System.out.print("Base R$");
                    Double base = sc.nextDouble();
                    PessoaFisica pf = new PessoaFisica(cpf, nome, ano);
                    pf.addCompras(compras);
                    pf.setBase(base);
                    
                    list.add(pf);
                    break;
                    
                case 'j':
                    System.out.print("CGC: ");
                    String cgc = sc.nextLine();
                    System.out.print("Taxa de Incentivo (%): ");
                    Double taxa = sc.nextDouble();
                    PessoaJuridica pj = new PessoaJuridica(cgc, nome, ano);
                    pj.addCompras(compras);
                    pj.setTaxaIncentivo(taxa);
                    
                    list.add(pj);
                    break;
                
                default: 
                    break;
            }
        }
        
        System.out.println("---\tPessoas: ");
        for (Pessoa pessoa : list) {
            System.out.println(pessoa);
            System.out.println("----------------");
        }
    }

}
