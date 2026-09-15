public class EmailNotificacion
        implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println(
            "Enviando EMAIL: " + mensaje
        );
    }
}