public class PedidoCreado
        implements EstadoPedido {

    @Override
    public void pagar(
            Pedido pedido) {

        System.out.println(
            "💳 Pedido pagado"
        );

        pedido.cambiarEstado(
            new PedidoPagado()
        );
    }

    @Override
    public void enviar(
            Pedido pedido) {

        System.out.println(
            "❌ Primero debemos pagar "
            + "el pedido"
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

        return "CREADO";
    }
}