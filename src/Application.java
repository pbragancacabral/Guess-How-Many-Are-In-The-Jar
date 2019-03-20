public class Application {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new Terminal();
        Controller controller = new Controller(model, view);
        while (!controller.isWon()) {
            controller.askGuess();
        }



    }


}