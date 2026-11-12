public class ProcesadorPeticion {

    public void procesar(
            Peticion peticion) {

        if (
            !peticion.estaAutenticada()
        ) {

            throw new RuntimeException(
                "Usuario no autenticado"
            );
        }

        if (
            !peticion.tienePermiso()
        ) {

            throw new RuntimeException(
                "Usuario no autorizado"
            );
        }

        if (
            !peticion.esValida()
        ) {

            throw new RuntimeException(
                "Petición inválida"
            );
        }

        System.out.println(
            "✅ Petición procesada"
        );
    }
}