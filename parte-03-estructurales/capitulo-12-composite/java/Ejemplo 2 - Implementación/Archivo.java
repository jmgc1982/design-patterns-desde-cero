public class Archivo
        implements ElementoSistema {

    private final String nombre;
    private final long tamano;

    public Archivo(
            String nombre,
            long tamano) {

        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public String getNombre() {

        return nombre;
    }

    @Override
    public long obtenerTamano() {

        return tamano;
    }

    @Override
    public void mostrar(
            String prefijo) {

        System.out.println(
            prefijo
            + "📄 "
            + nombre
            + " ("
            + tamano
            + " KB)"
        );
    }
}