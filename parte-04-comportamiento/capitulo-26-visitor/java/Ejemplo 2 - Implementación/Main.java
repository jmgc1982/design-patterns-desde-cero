public class Main {

    public static void main(String[] args) {

        Documento documento = new Documento();

        documento.agregar(
            new Parrafo("Patrones de Diseño desde Cero")
        );

        documento.agregar(
            new Imagen(
                "portada.png",
                "Portada del documento"
            )
        );

        documento.agregar(
            new Tabla(2, 3)
        );

        documento.agregar(
            new Parrafo(
                "Aprendiendo el patrón Visitor"
            )
        );

        // Primera operación: generar HTML

        VisitanteHTML html = new VisitanteHTML();

        documento.aceptar(html);

        System.out.println("🌐 DOCUMENTO HTML");

        System.out.println(
            html.getResultado()
        );

        // Segunda operación: estadísticas

        VisitanteEstadisticas estadisticas = new VisitanteEstadisticas();

        documento.aceptar(estadisticas);

        estadisticas.mostrarEstadisticas();
    }
}