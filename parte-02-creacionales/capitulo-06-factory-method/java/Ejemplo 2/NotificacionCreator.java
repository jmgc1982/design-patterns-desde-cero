public abstract class NotificacionCreator {

    public abstract Notificacion crearNotificacion();

    public void notificar(String mensaje) {

        Notificacion notificacion =
                crearNotificacion();

        notificacion.enviar(mensaje);
    }
}