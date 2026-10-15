public class PagoService {

    public boolean procesar(
            String cliente,
            double importe) {

        System.out.println(
            "💳 Procesando pago de "
            + importe
        );

        return true;
    }
}