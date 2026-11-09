public class ProcesadorPDF
        extends ProcesadorDocumento {

    @Override
    protected void generarContenido() {

        System.out.println(
            "📄 Generando contenido PDF"
        );
    }

    @Override
    protected void aplicarFormato() {

        System.out.println(
            "🎨 Aplicando formato PDF"
        );
    }
}