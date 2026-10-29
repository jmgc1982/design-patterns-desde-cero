public class NotificadorPush
        implements ObservadorStock {

    private final String dispositivo;

    public NotificadorPush(
            String dispositivo) {

        this.dispositivo =
                dispositivo;
    }

    @Override
    public void actualizar(
            Producto producto) {

        if (
            producto.getStock() > 0
        ) {

            System.out.println(
                "📱 Push a "
                + dispositivo
                + ": "
                + producto.getNombre()
                + " disponible."
            );
        }
    }
}