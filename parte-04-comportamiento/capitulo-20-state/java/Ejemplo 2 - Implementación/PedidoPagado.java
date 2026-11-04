public class PedidoPagado
        implements EstadoPedido {

    @Override
    public void pagar(
            Pedido pedido) {

        System.out.println(
            "❌ El pedido ya está pagado"
        );
    }

    @Override
    public void enviar(
            Pedido pedido) {

        System.out.println(
            "🚚 Pedido enviado"
        );

        pedido.cambiarEstado(
            new PedidoEnviado()
        );
    }

    @Override
    public void entregar(
            Pedido pedido) {

        System.out.println(
            "❌ El pedido todavía "
            + "no ha sido enviado"
        );
    }

    @Override
    public void cancelar(
            Pedido pedido) {

        System.out.println(
            "🚫 Pedido cancelado"
        );

        pedido.cambiarEstado(
            new PedidoCancelado()
        );
    }

    @Override
    public String nombre() {

        return "PAGADO";
    }
}