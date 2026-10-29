public class Main {

    public static void main(String[] args) {

        Producto consola =
                new Producto(
                    "PlayStation 5",
                    0
                );

        ObservadorStock email =
                new NotificadorEmail(
                    "usuario@email.com"
                );

        ObservadorStock push =
                new NotificadorPush(
                    "iPhone"
                );

        ObservadorStock estadisticas =
                new EstadisticasStock();

        consola.suscribir(
            email
        );

        consola.suscribir(
            push
        );

        consola.suscribir(
            estadisticas
        );

        consola.setStock(
            10
        );
    }
}