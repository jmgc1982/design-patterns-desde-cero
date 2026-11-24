public class VisitanteEstadisticas implements VisitanteDocumento {

    private int parrafos = 0;
    private int imagenes = 0;
    private int tablas = 0;

    @Override
    public void visitar(Parrafo parrafo) {
        parrafos++;
    }

    @Override
    public void visitar(Imagen imagen) {
        imagenes++;
    }

    @Override
    public void visitar(Tabla tabla) {
        tablas++;
    }

    public void mostrarEstadisticas() {
        System.out.println("📊 ESTADÍSTICAS DEL DOCUMENTO");
        System.out.println("Párrafos: " + parrafos);
        System.out.println("Imágenes: " + imagenes);
        System.out.println("Tablas: " + tablas);
    }
}