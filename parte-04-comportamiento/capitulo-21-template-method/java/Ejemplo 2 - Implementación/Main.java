public class Main {

    public static void main(String[] args) {

        ProcesadorDocumento pdf =
                new ProcesadorPDF();

        pdf.procesar();

        System.out.println();

        ProcesadorDocumento html =
                new ProcesadorHTML();

        html.procesar();

        System.out.println();

        ProcesadorDocumento txt =
                new ProcesadorTXT();

        txt.procesar();
    }
}