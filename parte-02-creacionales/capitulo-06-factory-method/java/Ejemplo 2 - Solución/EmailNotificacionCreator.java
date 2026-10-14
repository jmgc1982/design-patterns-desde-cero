public class EmailNotificacionCreator
        extends NotificacionCreator {

    @Override
    public Notificacion crearNotificacion() {
        return new EmailNotificacion();
    }
}