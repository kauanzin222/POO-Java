package fatec.poo.model;

import java.time.LocalDate;

public class FuncionarioComissionado extends Funcionario {

    private Double salBase;
    private Double taxaComissao;
    private Double totalVendas = 0.0;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(Integer registro, String nome, LocalDate dtAdmissao, Double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public Double getSalBase() {
        return salBase;
    }

    public void setSalBase(Double salBase) {
        this.salBase = salBase;
    }

    public Double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public void addVendas(Double vlrVenda) {
        totalVendas += vlrVenda;
    }

    @Override
    public Double calcSalBruto() {
        return salBase + taxaComissao * totalVendas;
    }

    public Double calcGratificacao() {
        if (totalVendas > 10000) {
            return calcSalBruto() * 0.05;
        } else if (totalVendas > 5000) {
            return calcSalBruto() * 0.03;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double calcSalLiquido() {
        return super.calcSalLiquido() + calcGratificacao();
    }
}
