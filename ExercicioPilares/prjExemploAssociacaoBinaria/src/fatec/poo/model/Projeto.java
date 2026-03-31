package fatec.poo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Projeto {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer codigo;
    private String descricao;
    private LocalDate dtInicio;
    private LocalDate dtTermino;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Projeto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(LocalDate dtTermino) {
        this.dtTermino = dtTermino;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void addFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

    public void listarFuncionario() {
        System.out.println("Código              : " + codigo);
        System.out.println("Descrição           : " + descricao);
        System.out.println("Data Início         : " + dtInicio.format(fmt1));
        System.out.println("Data Término        : " + dtTermino.format(fmt1));
        System.out.println("Qtde. Funcionarios  : " + funcionarios.size());

        System.out.println("\nRegistro \tNome \t\t\tCargo\t\t\t\tDepartamento");

        for (Funcionario func : funcionarios) {
            System.out.println(func.getRegistro() + "\t\t" + func.getNome()
                    + "\t\t" + func.getCargo() + "\t\t" + func.getDepartamento().getNome());
        }
    }
}
