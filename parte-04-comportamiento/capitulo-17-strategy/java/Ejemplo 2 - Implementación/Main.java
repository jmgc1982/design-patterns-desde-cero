public class Main {

    public static void main(String[] args) {

        ProcesadorPago procesador =
                new ProcesadorPago(
                    new PagoTarjeta()
                );

        procesador.procesar(
            120.50
        );

        procesador.setEstrategia(
            new PagoPayPal()
        );

        procesador.procesar(
            75.00
        );

        procesador.setEstrategia(
            new PagoTransferencia()
        );

        procesador.procesar(
            250.00
        );
    }
}