public class EditorTexto {

    private String contenido;
    private int cursor;

    public void escribir(String texto) {
        contenido += texto;
        cursor = contenido.length();
    }
}