public class Main {

    public static void main(String[] args) {
        
        EditorTexto editor = new EditorTexto();
        HistorialEditor historial = new HistorialEditor();
        editor.escribir("Hola");
        historial.guardar(editor.guardar());
        editor.escribir(" mundo");
        historial.guardar(editor.guardar());
        editor.escribir(" desde Java");
        editor.mostrar();
        editor.restaurar(historial.recuperar());
        editor.mostrar();
        editor.restaurar(historial.recuperar());
        editor.mostrar();
    }
}