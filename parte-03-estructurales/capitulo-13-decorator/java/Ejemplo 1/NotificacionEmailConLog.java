public class NotificacionEmailConLog extends NotificacionEmail {

    @Override
    public void enviar(
            String mensaje) {

        System.out.println(
            "📝 Registrando notificación"
        );

        super.enviar(mensaje);
    }
}