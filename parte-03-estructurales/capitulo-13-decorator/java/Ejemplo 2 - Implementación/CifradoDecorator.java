public class CifradoDecorator extends NotificacionDecorator {

    public CifradoDecorator(
            Notificacion notificacion) {

        super(notificacion);
    }

    @Override
    public void enviar(
            String mensaje) {

        String mensajeCifrado =
                cifrar(mensaje);

        super.enviar(
            mensajeCifrado
        );
    }

    private String cifrar(
            String mensaje) {

        return "[CIFRADO] "
                + mensaje;
    }
}