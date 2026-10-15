public class InventarioService {

    public boolean hayStock(
            String producto,
            int cantidad) {

        System.out.println(
            "📦 Comprobando stock de "
            + producto
        );

        return true;
    }

    public void reservar(
            String producto,
            int cantidad) {

        System.out.println(
            "📦 Reservadas "
            + cantidad
            + " unidades de "
            + producto
        );
    }
}