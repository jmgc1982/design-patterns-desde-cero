public class EditorTexto {

    private String contenido = "";
    private int cursor = 0;

    public void escribir(String texto) {
        contenido += texto;
        cursor = contenido.length();
    }

    public void reemplazar(String contenido) {
        this.contenido = contenido;
        this.cursor = contenido.length();
    }

    public EditorMemento guardar() {
        return new EditorMemento(contenido, cursor);
    }

    public void restaurar(EditorMemento memento) {
        this.contenido = memento.getContenido();
        this.cursor = memento.getCursor();
    }

    public void mostrar() {
        System.out.println("📝 " + contenido + " | cursor=" + cursor);
    }
}