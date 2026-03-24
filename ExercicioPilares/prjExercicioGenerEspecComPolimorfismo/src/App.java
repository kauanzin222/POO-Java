
import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira",
                LocalDate.parse("14/05/1978", fmt1), 15.80);

        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Estágiario");

        System.out.println("---\tFUNCIONÁRIO HORISTA");
        System.out.println("Nome:" + funcHor.getNome());
        System.out.println("Data de Admissão: " + funcHor.getDtAdmissao().format(fmt1));
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.printf("Salário Bruto: %.2f\n", funcHor.calcSalBruto());
        System.out.printf("Desconto: %.2f\n", funcHor.calcDesconto());
        System.out.printf("Salário Líquido: %.2f\n", funcHor.calcSalLiquido());
        System.out.printf("Gratificação: %.2f\n", funcHor.calcGratificacao());

        FuncionarioMensalista funcMens = new FuncionarioMensalista(1011, "Maria Antonieta",
                LocalDate.parse("21/03/1980", fmt1), 7.5);

        funcMens.setNumSalMin(90.9);
        funcMens.setCargo("Desenvolvedor Sênior");

        System.out.println("\n---\tFUNCIONÁRIO MENSALISTA");
        System.out.println("Nome: " + funcMens.getNome());
        System.out.println("Data de Admissão: " + funcMens.getDtAdmissao().format(fmt1));
        System.out.println("Cargo: " + funcMens.getCargo());
        System.out.printf("Salário Bruto: %.2f\n", funcMens.calcSalBruto());
        System.out.printf("Desconto: %.2f\n", funcMens.calcDesconto());
        System.out.printf("Salário Líquido: %.2f\n", funcMens.calcSalLiquido());

        FuncionarioComissionado funcCom = new FuncionarioComissionado(1012, "Marcos Vieira",
                LocalDate.parse("10/02/2000", fmt1), 0.2);
        funcCom.setCargo("Gestor de Projetos");
        funcCom.setSalBase(2000.0);
        funcCom.addVendas(5001.0);

        System.out.println("\n---\tFUNCIONÁRIO COMISSIONADO");
        System.out.println("Nome: " + funcCom.getNome());
        System.out.println("Data de Admissão: " + funcCom.getDtAdmissao().format(fmt1));
        System.out.println("Cargo: " + funcCom.getCargo());
        System.out.printf("Salário Bruto: %.2f\n", funcCom.calcSalBruto());
        System.out.printf("Desconto: %.2f\n", funcCom.calcDesconto());
        System.out.printf("Salário Líquido: %.2f\n", funcCom.calcSalLiquido());
        System.out.printf("Gratificação: %.2f\n", funcCom.calcGratificacao());
    }

}
