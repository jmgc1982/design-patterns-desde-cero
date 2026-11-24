public class Parrafo implements ElementoDocumento {

    private final String texto;

    public Parrafo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void aceptar(VisitanteDocumento visitante) {
        visitante.visitar(this);
    }
}