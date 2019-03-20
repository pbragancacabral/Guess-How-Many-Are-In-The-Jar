import java.util.Scanner;

public class Terminal implements View {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askItemName() {
        System.out.print("Item? ");
        return scanner.nextLine();
    }

    @Override
    public String askMaximumAmount() {
        System.out.print("Max amount? ");
        return scanner.nextLine();
    }

    @Override
    public String askGuess() {
        System.out.println("Guess?");
        return scanner.nextLine();
    }

    @Override
    public void display(int tries) {
        System.out.printf("Congratulations, it took you %d %s.",
                tries,
                tries == 1 ? "try" : "tries");
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}