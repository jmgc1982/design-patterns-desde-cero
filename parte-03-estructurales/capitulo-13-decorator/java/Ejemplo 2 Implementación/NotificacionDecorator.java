public abstract class NotificacionDecorator implements Notificacion {

    protected final Notificacion notificacion;

    protected NotificacionDecorator(
            Notificacion notificacion) {

        this.notificacion =
                notificacion;
    }

    @Override
    public void enviar(
            String mensaje) {

        notificacion.enviar(
            mensaje
        );
    }
}