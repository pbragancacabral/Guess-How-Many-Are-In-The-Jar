import java.util.Scanner;

public class Prompter {

    private Game game;
    private Scanner scanner;

    public Prompter(Game game) {
        this.game = game;
        this.scanner = new Scanner(System.in);
    }

    public void promptForGuess() {
        System.out.printf("How many %s are in the game? Pick a number between 1 and %d.%n",
                game.getItemName(),
                game.getMaximumAmount());
        int guess;
        while (true) {
            try {
                guess = validate(scanner.nextLine());
                break;
            } catch (IllegalArgumentException iae) {
                System.out.print(iae.getMessage());
            }
        }
        game.applyGuess(guess);
    }

    private int validate(String input) {
        int guess;
        if (input.length() == 0) {
            throw new IllegalArgumentException(String.format("Please provide input.%n"));
        }
        try {
            guess = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("Please provide a number.%n"));
        }
        if (guess > game.getMaximumAmount()) {
            throw new IllegalArgumentException(String.format("Please provide a number between 1 and %s.%n",
                    game.getMaximumAmount()));
        }
        return guess;
    }


    public void displayResult() {
        int tries = game.getTries();
        System.out.printf("Congratulations, it took you %d %s.",
                tries,
                tries == 1 ? "try" : "tries");
    }

}