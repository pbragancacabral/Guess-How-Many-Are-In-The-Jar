import java.util.Scanner;

public class Terminal implements View {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askItemName() {
        System.out.println("Item?");
        return scanner.nextLine();
    }

    @Override
    public int askMaximumAmount() {
        System.out.println("Max amount>");
        return scanner.nextInt();
    }

    @Override
    public int askGuess() {
        System.out.println("Guess?");
        return scanner.nextInt();
    }
}