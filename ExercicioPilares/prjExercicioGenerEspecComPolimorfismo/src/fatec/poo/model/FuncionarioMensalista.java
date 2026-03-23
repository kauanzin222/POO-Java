
package fatec.poo.model;

import java.time.LocalDate;

public class FuncionarioMensalista extends Funcionario {
    private Double valSalMin;
    private Double numSalMin;

    public FuncionarioMensalista(Double valSalMin) {
        this.valSalMin = valSalMin;
    }

    public FuncionarioMensalista(Integer registro, String nome, LocalDate dtAdmissao, Double valSalMin) {
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;
    }
    
    public Double getValSalMin() {
        return valSalMin;
    }

    public void setValSalMin(Double valSalMin) {
        this.valSalMin = valSalMin;
    }

    public Double getNumSalMin() {
        return numSalMin;
    }

    public void setNumSalMin(Double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    public Double calcSalBruto() {
        return valSalMin * numSalMin;
    }
}
