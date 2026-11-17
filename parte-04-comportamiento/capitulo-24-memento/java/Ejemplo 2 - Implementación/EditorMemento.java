public final class EditorMemento {

    private final String contenido;
    private final int cursor;

    EditorMemento(String contenido, int cursor) {
        this.contenido = contenido;
        this.cursor = cursor;
    }

    String getContenido() {
        return contenido;
    }

    int getCursor() {
        return cursor;
    }
}