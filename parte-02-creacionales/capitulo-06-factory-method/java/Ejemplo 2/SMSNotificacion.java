public class SMSNotificacion
        implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println(
            "Enviando SMS: " + mensaje
        );
    }
}