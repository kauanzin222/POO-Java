
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Departamento depart1 = new Departamento("DS", "Design");

        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira",
                LocalDate.parse("14/05/1978", fmt1), 15.80);
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Estágiario Quase Junior");
        depart1.addFuncionario(funcHor);

        Departamento depart2 = new Departamento("ES", "Engenharia de Software");

        FuncionarioMensalista funcMens = new FuncionarioMensalista(1011, "Maria Antonieta",
                LocalDate.parse("21/03/1980", fmt1), 7.5);
        funcMens.setNumSalMin(90.9);
        funcMens.setCargo("Desenvolvedor Sênior");
        depart2.addFuncionario(funcMens);

        Departamento depart3 = new Departamento("FT", "Fatecanos");

        FuncionarioComissionado funcCom = new FuncionarioComissionado(1012, "Marcos Vieira",
                LocalDate.parse("10/02/2000", fmt1), 0.2);
        funcCom.setCargo("Gestor de Projetos");
        funcCom.setSalBase(2000.0);
        funcCom.addVendas(5001.0);
        depart3.addFuncionario(funcCom);

        depart1.listarFuncionarios();
        System.out.println("---------------");
        depart2.listarFuncionarios();
        System.out.println("---------------");
        depart3.listarFuncionarios();

        Projeto prj = new Projeto(222, "Renovação da Empresa");
        prj.addFuncionario(funcHor);
        prj.addFuncionario(funcMens);
        prj.addFuncionario(funcCom);

        prj.setDtInicio(LocalDate.parse("20/01/2000", fmt1));
        prj.setDtTermino(LocalDate.parse("10/01/2002", fmt1));

        System.out.println("---------------\nPROJETOS: ");
        prj.listarFuncionario();
        
    }

}
