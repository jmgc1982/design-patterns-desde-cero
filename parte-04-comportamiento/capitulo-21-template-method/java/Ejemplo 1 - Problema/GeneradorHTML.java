public class GeneradorHTML {

    public void generar() {

        cargarDatos();

        validarDatos();

        generarContenido();

        aplicarFormatoHTML();

        guardar();
    }

    // ...
}