public class VisitanteHTML implements VisitanteDocumento {

    private final StringBuilder html = new StringBuilder();

    @Override
    public void visitar(Parrafo parrafo) {
        html.append("<p>")
            .append(escapar(parrafo.getTexto()))
            .append("</p>\n");
    }

    @Override
    public void visitar(Imagen imagen) {
        html.append("<img src=\"")
            .append(escapar(imagen.getRuta()))
            .append("\" alt=\"")
            .append(escapar(imagen.getDescripcion()))
            .append("\">\n");
    }

    @Override
    public void visitar(Tabla tabla) {
        html.append("<table>\n");

        for (int i = 0; i < tabla.getFilas(); i++) {

            html.append("  <tr>\n");

            for (int j = 0;
                    j < tabla.getColumnas();
                    j++) {

                html.append("    <td></td>\n");
            }

            html.append("  </tr>\n");
        }

        html.append("</table>\n");
    }

    public String getResultado() {
        return html.toString();
    }

    private String escapar(String valor) {

        return valor
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;")
            .replace("'", "&#39;");
    }
}