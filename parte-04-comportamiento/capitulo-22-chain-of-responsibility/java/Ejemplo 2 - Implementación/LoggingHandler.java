public class LoggingHandler
        extends AbstractHandler {

    @Override
    public boolean handle(
            Peticion peticion) {

        System.out.println(
            "📝 Registrando petición"
        );

        return next(
            peticion
        );
    }
}