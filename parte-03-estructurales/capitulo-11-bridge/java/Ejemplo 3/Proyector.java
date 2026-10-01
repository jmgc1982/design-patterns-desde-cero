public class Proyector implements Dispositivo {

    private boolean encendido;

    private int volumen;

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        encendido = true;
    }

    @Override
    public void apagar() {
        encendido = false;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(
            int volumen) {

        this.volumen = volumen;
    }
}