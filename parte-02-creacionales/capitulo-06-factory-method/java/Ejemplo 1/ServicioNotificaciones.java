public class ServicioNotificaciones {

    public void notificar(String mensaje) {

        EmailNotificacion notificacion =
                new EmailNotificacion();

        notificacion.enviar(mensaje);
    }
}