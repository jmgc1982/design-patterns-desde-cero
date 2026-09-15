public void notificar(
        String tipo,
        String mensaje) {

    if (tipo.equals("EMAIL")) {

        EmailNotificacion notificacion =
                new EmailNotificacion();

        notificacion.enviar(mensaje);

    } else if (tipo.equals("SMS")) {

        SMSNotificacion notificacion =
                new SMSNotificacion();

        notificacion.enviar(mensaje);
    }
}