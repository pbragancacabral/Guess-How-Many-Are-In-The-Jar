public class Application {

    public static void main(String[] args) {
        Game game = new Game("foo", 3);
        Prompter prompter = new Prompter(game);
        while (!game.isWon()) {
            prompter.promptForGuess();
        }
        prompter.displayResult();
    }


}