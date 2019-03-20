import java.util.Scanner;

public class Prompter {

    private Game game;
    private Scanner scanner;

    public Prompter(Game game) {
        this.game = game;
        this.scanner = new Scanner(System.in);
    }

    public void promptForGuess() {
        System.out.printf("How many jellybeans are in the game? Pick a number between 1 and %d. ",
                game.getMaximumAmount());
        int guess = scanner.nextInt();
        game.applyGuess(guess);
    }


}