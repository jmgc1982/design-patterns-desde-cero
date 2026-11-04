public class PedidoEnviado
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
            "❌ El pedido ya ha sido enviado"
        );
    }

    @Override
    public void entregar(
            Pedido pedido) {

        System.out.println(
            "📦 Pedido entregado"
        );

        pedido.cambiarEstado(
            new PedidoEntregado()
        );
    }

    @Override
    public void cancelar(
            Pedido pedido) {

        System.out.println(
            "❌ Un pedido enviado "
            + "ya no puede cancelarse"
        );
    }

    @Override
    public String nombre() {

        return "ENVIADO";
    }
}