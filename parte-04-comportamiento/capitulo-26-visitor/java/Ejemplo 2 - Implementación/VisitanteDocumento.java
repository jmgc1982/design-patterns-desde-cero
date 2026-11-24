public interface VisitanteDocumento {

    void visitar(Parrafo parrafo);

    void visitar(Imagen imagen);

    void visitar(Tabla tabla);
}