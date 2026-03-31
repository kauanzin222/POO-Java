package fatec.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String sigla;
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();
    private Integer numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public void addFuncionario(Funcionario func) {
        funcionarios.add(func);
        func.setDepartamento(this);
    }

    public void listarFuncionarios() {
        System.out.println("Sigla                   : " + sigla);
        System.out.println("Nome                    : " + nome);
        System.out.println("Qtde. de Funcionários   : " + funcionarios.size());

        System.out.println("\nRegistro  \tNome \t\t\tCargo");

        for (Funcionario func : funcionarios) {
            System.out.println(func.getRegistro() + "\t\t" + func.getNome()
                    + "\t\t" + func.getCargo());
        }
    }
}
