import java.util.ArrayList;
import java.util.List;

public class Carpeta
        implements ElementoSistema {

    private final String nombre;

    private final List<ElementoSistema>
            elementos =
            new ArrayList<>();

    public Carpeta(
            String nombre) {

        this.nombre = nombre;
    }

    public void agregar(
            ElementoSistema elemento) {

        elementos.add(elemento);
    }

    public void eliminar(
            ElementoSistema elemento) {

        elementos.remove(elemento);
    }

    @Override
    public String getNombre() {

        return nombre;
    }

    @Override
    public long obtenerTamano() {

        long total = 0;

        for (
            ElementoSistema elemento :
            elementos
        ) {

            total +=
                elemento.obtenerTamano();
        }

        return total;
    }

    @Override
    public void mostrar(
            String prefijo) {

        System.out.println(
            prefijo
            + "📁 "
            + nombre
        );

        for (
            ElementoSistema elemento :
            elementos
        ) {

            elemento.mostrar(
                prefijo + "   "
            );
        }
    }
}