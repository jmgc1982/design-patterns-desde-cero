public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println(
            "Enviando email: " + mensaje
        );
    }
}