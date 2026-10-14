public class ServicioNotificaciones {

    private final Notificador notificador;

    public ServicioNotificaciones(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviar(String mensaje) {
        notificador.enviar(mensaje);
    }
}