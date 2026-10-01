public class Main {

    public static void main(String[] args) {

        Dispositivo televisor =
                new Televisor();

        Mando mandoTV =
                new Mando(
                        televisor
                );

        mandoTV.alternarEncendido();

        mandoTV.subirVolumen();

        Dispositivo radio =
                new Radio();

        MandoAvanzado mandoRadio =
                new MandoAvanzado(
                        radio
                );

        mandoRadio.alternarEncendido();

        mandoRadio.subirVolumen();

        mandoRadio.silenciar();
    }
}