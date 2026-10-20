import java.util.ArrayList;
import java.util.List;

public class Bosque {

    private final List<Arbol> arboles =
            new ArrayList<>();

    public void plantar(
            int x,
            int y,
            String especie,
            String color,
            String textura) {

        TipoArbol tipo =
                TipoArbolFactory
                    .obtenerTipo(
                        especie,
                        color,
                        textura
                    );

        Arbol arbol =
                new Arbol(
                    x,
                    y,
                    tipo
                );

        arboles.add(
            arbol
        );
    }

    public void dibujar() {

        for (
            Arbol arbol :
            arboles
        ) {

            arbol.dibujar();
        }
    }

    public int numeroArboles() {

        return arboles.size();
    }
}