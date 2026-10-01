public class MandoConVoz extends Mando {

    public MandoConVoz(
            Dispositivo dispositivo) {

        super(dispositivo);
    }

    public void ejecutarComando(
            String comando) {

        System.out.println(
            "🎙️ Ejecutando: "
            + comando
        );
    }
}