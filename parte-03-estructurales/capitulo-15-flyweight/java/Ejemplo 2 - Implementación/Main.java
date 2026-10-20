public class Main {

    public static void main(String[] args) {

        Bosque bosque =
                new Bosque();

        bosque.plantar(
            10,
            20,
            "Roble",
            "Verde",
            "rugosa"
        );

        bosque.plantar(
            50,
            60,
            "Roble",
            "Verde",
            "rugosa"
        );

        bosque.plantar(
            100,
            120,
            "Roble",
            "Verde",
            "rugosa"
        );

        bosque.plantar(
            200,
            240,
            "Pino",
            "Verde oscuro",
            "fina"
        );

        bosque.dibujar();

        System.out.println(
            "Árboles: "
            + bosque.numeroArboles()
        );

        System.out.println(
            "Tipos compartidos: "
            + TipoArbolFactory
                .numeroTipos()
        );
    }
}