public class ProcesadorPago {

    public void pagar(
            String metodo,
            double cantidad) {

        if (metodo.equals("TARJETA")) {
            // Pago con tarjeta
        } else if (metodo.equals("PAYPAL")) {
            // Pago con PayPal
        } else if (metodo.equals("BIZUM")) {
            // Pago con Bizum
        }
    }
}