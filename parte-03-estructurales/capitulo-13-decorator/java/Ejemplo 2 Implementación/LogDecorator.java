public class LogDecorator extends NotificacionDecorator {

    public LogDecorator(
            Notificacion notificacion) {

        super(notificacion);
    }

    @Override
    public void enviar(
            String mensaje) {

        registrar(mensaje);

        super.enviar(
            mensaje
        );
    }

    private void registrar(
            String mensaje) {

        System.out.println(
            "📝 LOG: "
            + mensaje
        );
    }
}