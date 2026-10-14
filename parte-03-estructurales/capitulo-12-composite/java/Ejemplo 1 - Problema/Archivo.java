public class Archivo {

    private String nombre;
    private long tamano;

    public Archivo(
            String nombre,
            long tamano) {

        this.nombre = nombre;
        this.tamano = tamano;
    }

    public long obtenerTamano() {

        return tamano;
    }
}