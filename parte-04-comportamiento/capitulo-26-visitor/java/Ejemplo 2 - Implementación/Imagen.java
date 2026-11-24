public class Imagen implements ElementoDocumento {

    private final String ruta;
    private final String descripcion;

    public Imagen(String ruta, String descripcion) {
        this.ruta = ruta;
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void aceptar(VisitanteDocumento visitante) {
        visitante.visitar(this);
    }
}