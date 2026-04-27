
package fatec.poo.models;

import java.time.LocalDate;

public class PedidoCompra {
    private Integer numero;
    private LocalDate dataPedido;
    private Double valor;

    public PedidoCompra(Integer numero) {
        this.numero = numero;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public Double getValor() {
        return valor;
    }
}
