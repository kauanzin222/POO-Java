package fatec.poo.models;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {

    DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    private String cgc;
    private Double taxaIncentivo;

    public PessoaJuridica(String cgc, String nome, Integer anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }

    public void setTaxaIncentivo(Double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo / 100;
    }

    public String getCgc() {
        return cgc;
    }

    public Double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    @Override
    public Double calcBonus(Integer anoAtual) {
        return (super.getTotalCompras() * taxaIncentivo) * (anoAtual - super.getAnoInscricao());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("CGC                  : ").append(cgc).append("\n");
        sb.append("Taxa de Incentivo    : ").append(taxaIncentivo * 100).append("%\n");
        sb.append("Bônus                : ").append(df.format(calcBonus(LocalDate.now().getYear()))).append("\n");

        return sb.toString();
    }
}
