import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final List<String> libros = new ArrayList<>();

    public void agregar(String libro) {
        libros.add(libro);
    }

    public List<String> getLibros() {
        return libros;
    }
}

/*

// El cliente podría recorrer sus elementos

Biblioteca biblioteca = new Biblioteca();

biblioteca.agregar("Clean Code");
biblioteca.agregar("Effective Java");
biblioteca.agregar("Design Patterns");

List<String> libros = biblioteca.getLibros();

for (int i = 0; i < libros.size(); i++) {
    System.out.println(libros.get(i));
}

*/