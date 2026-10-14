public class Main {

    public static void main(String[] args) {

        Configuracion config1 =
                Configuracion.getInstance();

        Configuracion config2 =
                Configuracion.getInstance();

        System.out.println(
                config1 == config2
        );
    }
}