public class Documento implements Prototype<Documento> {

    private String titulo;
    private String contenido;
    private String autor;
    private String idioma;
    private String formato;

    private ConfiguracionPagina configuracion;

    public Documento(
            String titulo,
            String contenido,
            String autor,
            String idioma,
            String formato,
            ConfiguracionPagina configuracion) {

        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.idioma = idioma;
        this.formato = formato;
        this.configuracion = configuracion;
    }

    @Override
    public Documento clonar() {

        return new Documento(
                titulo,
                contenido,
                autor,
                idioma,
                formato,
                configuracion.clonar()
        );
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public ConfiguracionPagina getConfiguracion() {
        return configuracion;
    }
}