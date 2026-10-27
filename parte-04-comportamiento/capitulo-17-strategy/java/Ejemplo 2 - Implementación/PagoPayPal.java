public class PagoPayPal
        implements EstrategiaPago {

    @Override
    public void pagar(
            double cantidad) {

        System.out.println(
            "🅿️ Pagando "
            + cantidad
            + " € mediante PayPal"
        );
    }
}