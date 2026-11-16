public class Main {

    public static void main(String[] args) {

        ChatMediator chat = new Chat();

        Usuario ana = new Usuario("Ana", chat);

        Usuario jose = new Usuario("José", chat);

        Usuario laura = new Usuario("Laura", chat);

        chat.registrar(ana);

        chat.registrar(jose);

        chat.registrar(laura);

        ana.enviar("Hola a todos");

        jose.enviar("¡Hola Ana!");
    }
}