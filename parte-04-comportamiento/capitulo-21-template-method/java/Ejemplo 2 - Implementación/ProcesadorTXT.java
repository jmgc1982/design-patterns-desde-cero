public class ProcesadorTXT
        extends ProcesadorDocumento {

    @Override
    protected void generarContenido() {

        System.out.println(
            "📝 Generando texto plano"
        );
    }

    @Override
    protected void aplicarFormato() {

        System.out.println(
            "➖ Sin formato especial"
        );
    }

    @Override
    protected boolean debeGuardar() {

        return false;
    }
}