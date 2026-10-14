public class ServicioPedidos {

    private final PedidoRepository repository;

    public ServicioPedidos(
            PedidoRepository repository) {

        this.repository = repository;
    }

    public void guardar(Pedido pedido) {
        repository.guardar(pedido);
    }
}