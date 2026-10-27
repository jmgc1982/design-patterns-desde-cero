public class ProcesadorPago {

    public void pagar(
            String metodo,
            double cantidad) {

        if (
            metodo.equals("TARJETA")
        ) {

            pagarConTarjeta(
                cantidad
            );

        } else if (
            metodo.equals("PAYPAL")
        ) {

            pagarConPayPal(
                cantidad
            );

        } else if (
            metodo.equals(
                "TRANSFERENCIA"
            )
        ) {

            pagarConTransferencia(
                cantidad
            );

        } else {

            throw new IllegalArgumentException(
                "Método de pago no soportado"
            );
        }
    }

    private void pagarConTarjeta(
            double cantidad) {

        System.out.println(
            "💳 Pagando con tarjeta: "
            + cantidad
            + " €"
        );
    }

    private void pagarConPayPal(
            double cantidad) {

        System.out.println(
            "🅿️ Pagando con PayPal: "
            + cantidad
            + " €"
        );
    }

    private void pagarConTransferencia(
            double cantidad) {

        System.out.println(
            "🏦 Pagando mediante transferencia: "
            + cantidad
            + " €"
        );
    }
}