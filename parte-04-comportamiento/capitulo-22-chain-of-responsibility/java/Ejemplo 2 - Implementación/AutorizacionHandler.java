public class AutorizacionHandler
        extends AbstractHandler {

    @Override
    public boolean handle(
            Peticion peticion) {

        if (
            !peticion.estaAutorizada()
        ) {

            System.out.println(
                "❌ Usuario no autorizado"
            );

            return false;
        }

        System.out.println(
            "✅ Autorización correcta"
        );

        return next(
            peticion
        );
    }
}