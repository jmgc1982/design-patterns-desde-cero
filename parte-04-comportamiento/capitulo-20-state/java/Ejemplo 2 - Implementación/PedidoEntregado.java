public class PedidoEntregado
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

        System.out.println(
            "❌ El pedido ya está entregado"
        );
    }

    @Override
    public void cancelar(
            Pedido pedido) {

        System.out.println(
            "❌ Un pedido entregado "
            + "no puede cancelarse"
        );
    }

    private void operacionNoPermitida() {

        System.out.println(
            "❌ Operación no permitida "
            + "sobre un pedido entregado"
        );
    }

    @Override
    public String nombre() {

        return "ENTREGADO";
    }
}