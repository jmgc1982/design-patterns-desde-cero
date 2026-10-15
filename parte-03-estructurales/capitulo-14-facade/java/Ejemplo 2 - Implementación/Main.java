public class Main {

    public static void main(String[] args) {

        TiendaFacade tienda =
                new TiendaFacade();

        tienda.realizarPedido(
            "PORTATIL",
            1,
            "jose@email.com",
            "Palma",
            1200.00
        );
    }
}