public class Mando {

    protected final Dispositivo dispositivo;

    public Mando(
            Dispositivo dispositivo) {

        this.dispositivo =
                dispositivo;
    }

    public void alternarEncendido() {

        if (
            dispositivo
                .estaEncendido()
        ) {

            dispositivo.apagar();

        } else {

            dispositivo.encender();
        }
    }

    public void subirVolumen() {

        dispositivo.setVolumen(
            dispositivo.getVolumen()
            + 10
        );
    }

    public void bajarVolumen() {

        dispositivo.setVolumen(
            dispositivo.getVolumen()
            - 10
        );
    }
}