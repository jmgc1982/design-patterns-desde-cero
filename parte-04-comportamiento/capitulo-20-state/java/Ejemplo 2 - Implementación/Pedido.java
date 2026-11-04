public class Pedido {

    private EstadoPedido estado;

    public Pedido() {

        this.estado =
                new PedidoCreado();
    }

    public void cambiarEstado(
            EstadoPedido estado) {

        this.estado =
                estado;
    }

    public void pagar() {

        estado.pagar(
            this
        );
    }

    public void enviar() {

        estado.enviar(
            this
        );
    }

    public void entregar() {

        estado.entregar(
            this
        );
    }

    public void cancelar() {

        estado.cancelar(
            this
        );
    }

    public String getEstado() {

        return estado.nombre();
    }
}