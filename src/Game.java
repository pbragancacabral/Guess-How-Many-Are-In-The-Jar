import java.util.Random;

public class Game {
    private String itemName;
    private int maximumAmount;
    private int currentAmount;
    private int guess;
    private int tries;

    public Game(String itemName, int maximumAmount) {
        Random random = new Random();
        this.itemName = itemName;
        this.maximumAmount = maximumAmount;
        currentAmount = random.nextInt(maximumAmount) + 1;
    }

    public String getItemName() {
        return itemName;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }

    public int getTries() {
        return tries;
    }

    public void applyGuess(int guess) {
        this.guess = guess;
        tries++;
    }

    public boolean isWon() {
        return guess == currentAmount;
    }


}