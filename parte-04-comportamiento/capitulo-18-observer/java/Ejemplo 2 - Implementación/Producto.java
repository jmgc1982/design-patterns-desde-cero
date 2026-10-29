import java.util.ArrayList;
import java.util.List;

public class Producto {

    private final String nombre;

    private int stock;

    private final List<ObservadorStock>
            observadores =
            new ArrayList<>();

    public Producto(
            String nombre,
            int stock) {

        this.nombre = nombre;
        this.stock = stock;
    }

    public void suscribir(
            ObservadorStock observador) {

        observadores.add(
            observador
        );
    }

    public void desuscribir(
            ObservadorStock observador) {

        observadores.remove(
            observador
        );
    }

    private void notificar() {

        for (
            ObservadorStock observador :
            observadores
        ) {

            observador.actualizar(
                this
            );
        }
    }

    public void setStock(
            int stock) {

        this.stock = stock;

        notificar();
    }

    public String getNombre() {

        return nombre;
    }

    public int getStock() {

        return stock;
    }
}