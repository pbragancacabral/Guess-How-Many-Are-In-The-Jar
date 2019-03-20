public class Application {
    public static void main(String[] args) {
        View view = new Terminal();
        Controller controller = new Controller(view);
        while (!controller.isWon()) {
            controller.askGuess();
            if (!controller.isWon()) {
                controller.displayHint();
            }
        }
        controller.displayResults();
    }
}