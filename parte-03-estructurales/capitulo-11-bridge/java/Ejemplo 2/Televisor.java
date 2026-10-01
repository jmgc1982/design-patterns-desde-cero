public class Televisor implements Dispositivo {

    private boolean encendido;

    private int volumen = 30;

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {

        encendido = true;

        System.out.println(
            "📺 Televisor encendido"
        );
    }

    @Override
    public void apagar() {

        encendido = false;

        System.out.println(
            "📺 Televisor apagado"
        );
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(
            int volumen) {

        this.volumen =
                Math.max(
                    0,
                    Math.min(
                        volumen,
                        100
                    )
                );

        System.out.println(
            "📺 Volumen TV: "
            + this.volumen
        );
    }
}