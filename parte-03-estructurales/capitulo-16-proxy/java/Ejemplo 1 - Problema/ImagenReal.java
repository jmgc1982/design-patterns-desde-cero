public class ImagenReal
        implements Imagen {

    private final String archivo;

    public ImagenReal(
            String archivo) {

        this.archivo = archivo;

        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {

        System.out.println(
            "📂 Cargando imagen pesada: "
            + archivo
        );
    }

    @Override
    public void mostrar() {

        System.out.println(
            "🖼️ Mostrando imagen: "
            + archivo
        );
    }
}