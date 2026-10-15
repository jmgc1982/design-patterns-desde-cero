public class EnvioService {

    public String crearEnvio(
            String producto,
            String direccion) {

        String numeroEnvio =
                "ENV-001";

        System.out.println(
            "🚚 Envío creado para "
            + producto
            + " hacia "
            + direccion
        );

        return numeroEnvio;
    }
}