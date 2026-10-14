public class PedidoService {

    private final MySQLPedidoRepository repository;

    public PedidoService() {
        repository = new MySQLPedidoRepository();
    }
}