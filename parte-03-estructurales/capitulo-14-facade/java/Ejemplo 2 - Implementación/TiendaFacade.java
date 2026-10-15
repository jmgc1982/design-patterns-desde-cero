public class TiendaFacade {

    private final InventarioService inventario;
    private final PagoService pagos;
    private final EnvioService envios;
    private final NotificacionService notificaciones;

    public TiendaFacade() {

        this.inventario =
                new InventarioService();

        this.pagos =
                new PagoService();

        this.envios =
                new EnvioService();

        this.notificaciones =
                new NotificacionService();
    }

    public boolean realizarPedido(
            String producto,
            int cantidad,
            String cliente,
            String direccion,
            double importe) {

        if (
            !inventario.hayStock(
                producto,
                cantidad
            )
        ) {

            System.out.println(
                "❌ No hay stock suficiente"
            );

            return false;
        }

        if (
            !pagos.procesar(
                cliente,
                importe
            )
        ) {

            System.out.println(
                "❌ No se pudo procesar el pago"
            );

            return false;
        }

        inventario.reservar(
            producto,
            cantidad
        );

        String numeroEnvio =
                envios.crearEnvio(
                    producto,
                    direccion
                );

        notificaciones
            .enviarConfirmacion(
                cliente,
                numeroEnvio
            );

        return true;
    }
}