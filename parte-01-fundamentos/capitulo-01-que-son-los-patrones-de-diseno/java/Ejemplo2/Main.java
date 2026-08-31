public class Main {

    public static void main(String[] args) {

        Notificador notificador = new EmailNotificador();

        ServicioNotificaciones servicio = new ServicioNotificaciones(notificador);

        servicio.enviar("Hola desde Patrones de Diseño");
    }
}