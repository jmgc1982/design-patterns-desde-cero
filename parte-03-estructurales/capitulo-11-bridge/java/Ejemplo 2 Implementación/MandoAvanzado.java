public class MandoAvanzado extends Mando {

    public MandoAvanzado(
            Dispositivo dispositivo) {

        super(dispositivo);
    }

    public void silenciar() {

        dispositivo.setVolumen(0);

        System.out.println(
            "🔇 Dispositivo silenciado"
        );
    }
}