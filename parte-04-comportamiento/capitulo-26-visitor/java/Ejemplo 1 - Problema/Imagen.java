public class Imagen implements ElementoDocumento {

    private final String ruta;

    public Imagen(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
}