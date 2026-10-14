public interface Dispositivo {

    boolean estaEncendido();

    void encender();

    void apagar();

    int getVolumen();

    void setVolumen(int volumen);
}