public class ValidacionHandler
        extends AbstractHandler {

    @Override
    public boolean handle(
            Peticion peticion) {

        if (
            !peticion.esValida()
        ) {

            System.out.println(
                "❌ Petición inválida"
            );

            return false;
        }

        System.out.println(
            "✅ Petición válida"
        );

        return next(
            peticion
        );
    }
}