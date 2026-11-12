public class AutenticacionHandler
        extends AbstractHandler {

    @Override
    public boolean handle(
            Peticion peticion) {

        if (
            !peticion.estaAutenticada()
        ) {

            System.out.println(
                "❌ Usuario no autenticado"
            );

            return false;
        }

        System.out.println(
            "✅ Autenticación correcta"
        );

        return next(
            peticion
        );
    }
}