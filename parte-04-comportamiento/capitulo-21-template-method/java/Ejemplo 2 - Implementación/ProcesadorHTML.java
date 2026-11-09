public class ProcesadorHTML
        extends ProcesadorDocumento {

    @Override
    protected void generarContenido() {

        System.out.println(
            "🌐 Generando contenido HTML"
        );
    }

    @Override
    protected void aplicarFormato() {

        System.out.println(
            "🏷️ Generando etiquetas HTML"
        );
    }
}