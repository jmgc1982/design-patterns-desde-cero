public class MySQLPedidoRepository implements PedidoRepository {

    @Override
    public void guardar(Pedido pedido) {
        System.out.println(
            "Guardando pedido en MySQL..."
        );
    }
}