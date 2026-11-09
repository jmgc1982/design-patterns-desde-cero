public abstract class ProcesadorDocumento {

    public final void procesar() {

        cargarDatos();

        validarDatos();

        generarContenido();

        aplicarFormato();

        if (debeGuardar()) {

            guardar();
        }

        finalizar();
    }

    private void cargarDatos() {

        System.out.println(
            "📥 Cargando datos"
        );
    }

    private void validarDatos() {

        System.out.println(
            "✅ Validando datos"
        );
    }

    protected abstract void generarContenido();

    protected abstract void aplicarFormato();

    private void guardar() {

        System.out.println(
            "💾 Guardando documento"
        );
    }

    protected boolean debeGuardar() {

        return true;
    }

    protected void finalizar() {

        System.out.println(
            "🏁 Proceso finalizado"
        );
    }
}