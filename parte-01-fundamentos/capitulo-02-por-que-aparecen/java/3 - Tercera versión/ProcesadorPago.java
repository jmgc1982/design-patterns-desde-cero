public class ProcesadorPago {

    public void pagar(
            String metodo,
            double cantidad) {

        if (metodo.equals("TARJETA")) {
            // ...
        } else if (metodo.equals("PAYPAL")) {
            // ...
        } else if (metodo.equals("BIZUM")) {
            // ...
        } else if (metodo.equals("APPLE_PAY")) {
            // ...
        } else if (metodo.equals("GOOGLE_PAY")) {
            // ...
        } else if (metodo.equals("TRANSFERENCIA")) {
            // ...
        }
    }
}