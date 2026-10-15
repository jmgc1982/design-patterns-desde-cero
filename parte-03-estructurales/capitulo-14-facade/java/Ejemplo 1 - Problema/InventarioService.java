public class InventarioService {

    public boolean hayStock(
            String producto,
            int cantidad) {

        System.out.println(
            "📦 Comprobando stock..."
        );

        return true;
    }

    public void reservar(
            String producto,
            int cantidad) {

        System.out.println(
            "📦 Stock reservado"
        );
    }
}