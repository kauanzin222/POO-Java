package fatec.poo.models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

    DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    private String nome;
    private Integer anoInscricao;
    private Double totalCompras = 0.0;
    private List<PedidoCompra> listPedido = new ArrayList<>();

    public Pessoa(String nome, Integer anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoInscricao() {
        return anoInscricao;
    }

    public Double getTotalCompras() {
        return totalCompras;
    }

    public abstract Double calcBonus(Integer anoAtual);

    public void addCompras(PedidoCompra pedido) {
        totalCompras += pedido.getValor();
        listPedido.add(pedido);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome             : ").append(nome).append("\n");
        sb.append("Ano Inscrição    : ").append(anoInscricao).append("\n");
        sb.append("Total de Compras : ").append(df.format(totalCompras)).append("\n");

        return sb.toString();
    }
}
