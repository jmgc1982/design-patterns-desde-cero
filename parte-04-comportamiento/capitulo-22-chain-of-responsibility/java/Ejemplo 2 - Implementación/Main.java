public class Main {

    public static void main(String[] args) {

        Handler autenticacion =
                new AutenticacionHandler();

        Handler autorizacion =
                new AutorizacionHandler();

        Handler validacion =
                new ValidacionHandler();

        Handler logging =
                new LoggingHandler();

        autenticacion
            .setNext(autorizacion)
            .setNext(validacion)
            .setNext(logging);

        Peticion peticion =
                new Peticion(
                    true,
                    true,
                    true
                );

        boolean resultado =
                autenticacion.handle(
                    peticion
                );

        System.out.println(
            resultado
                ? "✅ Petición aceptada"
                : "❌ Petición rechazada"
        );
    }
}