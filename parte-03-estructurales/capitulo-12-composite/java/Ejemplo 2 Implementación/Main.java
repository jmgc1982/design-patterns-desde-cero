public class Main {

    public static void main(String[] args) {

        Archivo readme =
                new Archivo(
                    "README.md",
                    10
                );

        Archivo main =
                new Archivo(
                    "Main.java",
                    25
                );

        Archivo usuario =
                new Archivo(
                    "Usuario.java",
                    30
                );

        Archivo arquitectura =
                new Archivo(
                    "arquitectura.pdf",
                    120
                );

        Carpeta src =
                new Carpeta(
                    "src"
                );

        src.agregar(main);
        src.agregar(usuario);

        Carpeta docs =
                new Carpeta(
                    "docs"
                );

        docs.agregar(
            arquitectura
        );

        Carpeta proyecto =
                new Carpeta(
                    "proyecto"
                );

        proyecto.agregar(
            readme
        );

        proyecto.agregar(
            src
        );

        proyecto.agregar(
            docs
        );

        proyecto.mostrar("");

        System.out.println(
            "Tamaño total: "
            + proyecto.obtenerTamano()
            + " KB"
        );
    }
}