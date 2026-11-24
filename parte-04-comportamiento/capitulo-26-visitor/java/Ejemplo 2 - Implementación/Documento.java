import java.util.ArrayList;
import java.util.List;

public class Documento {

    private final List<ElementoDocumento> elementos = new ArrayList<>();

    public void agregar(ElementoDocumento elemento) {
        elementos.add(elemento);
    }

    public void aceptar(VisitanteDocumento visitante) {

        for (ElementoDocumento elemento : elementos) {
            elemento.aceptar(visitante);
        }
    }
}