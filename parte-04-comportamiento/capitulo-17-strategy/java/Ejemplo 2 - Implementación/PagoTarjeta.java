public class PagoTarjeta
        implements EstrategiaPago {

    @Override
    public void pagar(
            double cantidad) {

        System.out.println(
            "💳 Pagando "
            + cantidad
            + " € con tarjeta"
        );
    }
}