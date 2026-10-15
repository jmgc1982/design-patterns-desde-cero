public class NotificacionService {

    public void enviarConfirmacion(
            String cliente,
            String numeroEnvio) {

        System.out.println(
            "📧 Confirmación enviada a "
            + cliente
        );
    }
}