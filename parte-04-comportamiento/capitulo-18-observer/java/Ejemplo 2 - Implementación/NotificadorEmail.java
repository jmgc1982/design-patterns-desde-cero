public class NotificadorEmail
        implements ObservadorStock {

    private final String email;

    public NotificadorEmail(
            String email) {

        this.email = email;
    }

    @Override
    public void actualizar(
            Producto producto) {

        if (
            producto.getStock() > 0
        ) {

            System.out.println(
                "📧 Email a "
                + email
                + ": "
                + producto.getNombre()
                + " vuelve a estar disponible."
            );
        }
    }
}