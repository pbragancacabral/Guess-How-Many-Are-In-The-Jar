import java.util.Scanner;

public class Terminal implements View {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askItemName() {
        System.out.print("What item would you like to store in the Jar? ");
        return scanner.nextLine();
    }

    @Override
    public String askMaximumAmount(String itemName) {
        System.out.printf("What is the maximum amount of %s that will fit in the Jar? ",
                itemName);
        return scanner.nextLine();
    }

    @Override
    public String askGuess(String itemName) {
        System.out.printf("How many %s are in the Jar? ",
                itemName);
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