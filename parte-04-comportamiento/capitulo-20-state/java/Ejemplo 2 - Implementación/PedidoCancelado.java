public class PedidoCancelado
        implements EstadoPedido {

    @Override
    public void pagar(
            Pedido pedido) {

        operacionNoPermitida();
    }

    @Override
    public void enviar(
            Pedido pedido) {

        operacionNoPermitida();
    }

    @Override
    public void entregar(
            Pedido pedido) {

        operacionNoPermitida();
    }

    @Override
    public void cancelar(
            Pedido pedido) {

        System.out.println(
            "❌ El pedido ya está cancelado"
        );
    }

    private void operacionNoPermitida() {

        System.out.println(
            "❌ Operación no permitida "
            + "sobre un pedido cancelado"
        );
    }

    @Override
    public String nombre() {

        return "CANCELADO";
    }
}