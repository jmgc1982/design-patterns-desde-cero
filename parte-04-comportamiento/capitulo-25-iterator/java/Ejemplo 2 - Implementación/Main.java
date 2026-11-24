import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregar(
            new Libro("Clean Code", "Robert C. Martin")
        );

        biblioteca.agregar(
            new Libro("Effective Java", "Joshua Bloch")
        );

        biblioteca.agregar(
            new Libro("Design Patterns", "Gang of Four")
        );

        biblioteca.agregar(
            new Libro("Refactoring", "Martin Fowler")
        );

        System.out.println("📚 Recorrido con Iterator:");

        Iterator<Libro> iterador = biblioteca.iterator();

        while (iterador.hasNext()) {

            Libro libro = iterador.next();

            System.out.println(libro);
        }

        System.out.println();

        System.out.println("📖 Recorrido con for-each:");

        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }
}