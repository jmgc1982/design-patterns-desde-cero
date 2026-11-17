import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialEditor {

    private final Deque<EditorMemento> historial = new ArrayDeque<>();

    public void guardar(EditorMemento memento) {
        historial.push(memento);
    }

    public EditorMemento recuperar() {
        if (historial.isEmpty()) {
            return null;
        }
        return historial.pop();
    }

    public boolean estaVacio() {
        return historial.isEmpty();
    }
}