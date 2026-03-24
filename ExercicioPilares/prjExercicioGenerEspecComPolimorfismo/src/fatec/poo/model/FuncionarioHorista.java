
package fatec.poo.model;

import java.time.LocalDate;

public class FuncionarioHorista extends Funcionario {
    private Double valHorTrab;
    private Integer qtdeHorTrab;
    
    public FuncionarioHorista() {
        super();
    }

    public FuncionarioHorista(Integer registro, String nome, LocalDate dtAdmissao, Double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    
    public Double getValHorTrab() {
        return valHorTrab;
    }

    public void setValHorTrab(Double valHorTrab) {
        this.valHorTrab = valHorTrab;
    }

    public Integer getQtdeHorTrab() {
        return qtdeHorTrab;
    }

    public void setQtdeHorTrab(Integer qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    public Double calcSalBruto(){
        return valHorTrab * qtdeHorTrab;
    }
    
    public Double calcGratificacao() {
        return calcSalBruto() * 0.75;
    }
   
    @Override
    public Double calcSalLiquido() {
        return super.calcSalLiquido() + calcGratificacao();
    }
}
