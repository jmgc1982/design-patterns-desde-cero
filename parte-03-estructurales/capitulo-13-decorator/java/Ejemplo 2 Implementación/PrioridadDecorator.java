public class PrioridadDecorator extends NotificacionDecorator {

    public PrioridadDecorator(
            Notificacion notificacion) {

        super(notificacion);
    }

    @Override
    public void enviar(
            String mensaje) {

        super.enviar(
            "[URGENTE] "
            + mensaje
        );
    }
}