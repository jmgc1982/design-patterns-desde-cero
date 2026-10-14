public class ProcesadorPago {

    public void pagar(
            String metodo,
            double cantidad) {

        if (metodo.equals("TARJETA")) {
            pagarConTarjeta(cantidad);

        } else if (metodo.equals("PAYPAL")) {
            pagarConPayPal(cantidad);

        } else if (metodo.equals("TRANSFERENCIA")) {
            pagarConTransferencia(cantidad);

        } else if (metodo.equals("BIZUM")) {
            pagarConBizum(cantidad);
        }
    }

    private void pagarConTarjeta(double cantidad) {
        // ...
    }

    private void pagarConPayPal(double cantidad) {
        // ...
    }

    private void pagarConTransferencia(double cantidad) {
        // ...
    }

    private void pagarConBizum(double cantidad) {
        // ...
    }
}