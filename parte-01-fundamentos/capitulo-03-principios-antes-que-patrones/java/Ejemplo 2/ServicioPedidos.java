public class ServicioPedidos {

    private final MySQLRepository repository;

    public ServicioPedidos() {
        this.repository = new MySQLRepository();
    }

    public void guardar(Pedido pedido) {
        repository.guardar(pedido);
    }
}