public class Main {

    public static void main(String[] args) {

        Imagen imagen =
                new ProxyImagen(
                    "foto.jpg"
                );

        System.out.println(
            "Proxy creado"
        );

        System.out.println(
            "Primera visualización"
        );

        imagen.mostrar();

        System.out.println(
            "Segunda visualización"
        );

        imagen.mostrar();
    }
}