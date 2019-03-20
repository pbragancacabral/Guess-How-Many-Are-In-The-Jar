import java.util.Random;

public class Controller {

    private Model model;
    private View view;
    private int guess;
    private int tries;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        Random random = new Random();
        String itemName = view.askItemName();
        int maximumAmount = view.askMaximumAmount();
        model.setItemName(itemName);
        model.setMaximumAmount(maximumAmount);
        model.setCurrentAmount(random.nextInt(model.getMaximumAmount()) + 1);
    }

    public void askGuess() {
        guess = view.askGuess();
    }

    public boolean isWon() {
        return guess == model.getCurrentAmount();
    }

}