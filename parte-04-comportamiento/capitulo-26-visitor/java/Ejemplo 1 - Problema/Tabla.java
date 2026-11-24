public class Tabla implements ElementoDocumento {

    private final int filas;
    private final int columnas;

    public Tabla(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}