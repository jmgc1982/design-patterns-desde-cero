public class Main {

    public static void main(String[] args) {

        NotificacionCreator creatorEmail =
                new EmailNotificacionCreator();

        creatorEmail.notificar(
                "Tu pedido ha sido enviado"
        );

        NotificacionCreator creatorSMS =
                new SMSNotificacionCreator();

        creatorSMS.notificar(
                "Tu código de verificación es 1234"
        );
    }
}