public class ServicioNotificaciones {

    public void enviar(String mensaje) {

        GmailClient gmail = new GmailClient();

        gmail.send(mensaje);
    }
}