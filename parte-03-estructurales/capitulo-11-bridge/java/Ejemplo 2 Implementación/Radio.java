public class Radio implements Dispositivo {

    private boolean encendida;

    private int volumen = 20;

    @Override
    public boolean estaEncendido() {
        return encendida;
    }

    @Override
    public void encender() {

        encendida = true;

        System.out.println(
            "📻 Radio encendida"
        );
    }

    @Override
    public void apagar() {

        encendida = false;

        System.out.println(
            "📻 Radio apagada"
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
            "📻 Volumen radio: "
            + this.volumen
        );
    }
}