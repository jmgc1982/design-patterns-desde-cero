public class ProxyImagen
        implements Imagen {

    private final String archivo;

    private ImagenReal imagenReal;

    public ProxyImagen(
            String archivo) {

        this.archivo = archivo;
    }

    @Override
    public void mostrar() {

        if (imagenReal == null) {

            imagenReal =
                    new ImagenReal(
                        archivo
                    );
        }

        imagenReal.mostrar();
    }
}