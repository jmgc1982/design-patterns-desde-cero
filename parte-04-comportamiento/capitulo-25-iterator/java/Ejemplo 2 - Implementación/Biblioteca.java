import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Biblioteca implements Iterable<Libro> {

    private final List<Libro> libros = new ArrayList<>();

    public void agregar(Libro libro) {
        libros.add(libro);
    }

    public int cantidad() {
        return libros.size();
    }

    @Override
    public Iterator<Libro> iterator() {
        return new IteradorBiblioteca();
    }

    private class IteradorBiblioteca implements Iterator<Libro> {

        private int posicion = 0;

        @Override
        public boolean hasNext() {
            return posicion < libros.size();
        }

        @Override
        public Libro next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            return libros.get(posicion++);
        }
    }
}