import java.util.Random;

public class Game {
    private String itemName;
    private int maximumAmount;
    private int currentAmount;
    private int guess;

    public Game(String itemName, int maximumAmount) {
        Random random = new Random();
        this.itemName = itemName;
        this.maximumAmount = maximumAmount;
        currentAmount = random.nextInt(maximumAmount) + 1;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }

    public void applyGuess(int guess) {
        this.guess = guess;
    }

    public boolean isWon() {
        return guess == currentAmount;
    }


}