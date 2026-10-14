public class NotificacionEmail
        implements Notificacion {

    @Override
    public void enviar(
            String mensaje) {

        System.out.println(
            "📧 Enviando email: "
            + mensaje
        );
    }
}