package fatec.poo.model;

import java.time.LocalDate;

public abstract class Funcionario {

    private Integer registro;
    private String nome;
    private LocalDate dtAdmissao;
    private String cargo;
    private Departamento departamento;

    public Funcionario() {
    }

    public Funcionario(Integer registro, String nome, LocalDate dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(LocalDate dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    abstract public Double calcSalBruto();

    public Double calcDesconto() {
        return 0.10 * calcSalBruto();
    }

    public Double calcSalLiquido() {
        return calcSalBruto() - calcDesconto();
    }
    
}
