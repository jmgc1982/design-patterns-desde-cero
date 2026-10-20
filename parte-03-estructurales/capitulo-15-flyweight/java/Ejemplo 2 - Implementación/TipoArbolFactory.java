import java.util.HashMap;
import java.util.Map;

public class TipoArbolFactory {

    private static final Map<String, TipoArbol>
            tipos =
            new HashMap<>();

    public static TipoArbol obtenerTipo(
            String especie,
            String color,
            String textura) {

        String clave =
                especie
                + "-"
                + color
                + "-"
                + textura;

        return tipos.computeIfAbsent(
            clave,
            k -> new TipoArbol(
                especie,
                color,
                textura
            )
        );
    }

    public static int numeroTipos() {

        return tipos.size();
    }
}