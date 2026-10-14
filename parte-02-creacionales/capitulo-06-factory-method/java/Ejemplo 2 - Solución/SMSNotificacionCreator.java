public class SMSNotificacionCreator
        extends NotificacionCreator {

    @Override
    public Notificacion crearNotificacion() {
        return new SMSNotificacion();
    }
}