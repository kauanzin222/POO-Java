package fatec.poo.models;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    private String cpf;
    private Double base;

    public PessoaFisica(String cpf, String nome, Integer anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public Double calcBonus(Integer anoAtual) {
        int anoDiferenca = 1;

        if (super.getTotalCompras() > 12000) {
            anoDiferenca = anoAtual - super.getAnoInscricao();
        }

        return base * anoDiferenca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("CPF      : ").append(cpf).append("\n");
        sb.append("Base     : ").append(df.format(base)).append("\n");
        sb.append("Bônus    : ").append(df.format(calcBonus(LocalDate.now().getYear()))).append("\n");

        return sb.toString();
    }
}
