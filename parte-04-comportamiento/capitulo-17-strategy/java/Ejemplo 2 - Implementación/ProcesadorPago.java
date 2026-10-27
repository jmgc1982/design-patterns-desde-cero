public class ProcesadorPago {

    private EstrategiaPago estrategia;

    public ProcesadorPago(
            EstrategiaPago estrategia) {

        this.estrategia =
                estrategia;
    }

    public void setEstrategia(
            EstrategiaPago estrategia) {

        this.estrategia =
                estrategia;
    }

    public void procesar(
            double cantidad) {

        if (estrategia == null) {

            throw new IllegalStateException(
                "No se ha definido una estrategia"
            );
        }

        estrategia.pagar(
            cantidad
        );
    }
}