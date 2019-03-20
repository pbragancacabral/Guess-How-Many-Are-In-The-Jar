import java.util.Random;

public class Controller {

    private Model model;
    private View view;
    private int guess;
    private int tries;

    public Controller(View view) {
        this.model = new Model();
        this.view = view;
        Random random = new Random();
        String itemName = askItemName();
        int maximumAmount = askMaximumAmount();
        model.setItemName(itemName);
        model.setMaximumAmount(maximumAmount);
        model.setCurrentAmount(random.nextInt(model.getMaximumAmount()) + 1);
    }

    private String askItemName() {
        String itemName;
        while (true) {
            try {
                itemName = view.askItemName().trim();
                if (itemName.length() == 0) {
                    throw new IllegalArgumentException("A noun is required.");
                }
                break;
            } catch (IllegalArgumentException iae) {
                view.display(iae.getMessage());
            }

        }
        return itemName;
    }

    private int askMaximumAmount() {
        int maximumAmount;
        while (true) {
            try {
                maximumAmount = Integer.parseInt(view.askMaximumAmount());
                break;
            } catch (Exception e) {
                view.display("A number is required.");
            }

        }
        return maximumAmount;
    }

    public void askGuess() {
        while (true) {
            try {
                guess = Integer.parseInt(view.askGuess());
                if (guess > model.getMaximumAmount()) {
                    throw new IllegalArgumentException(String.format("Guess must be between 1 and %s",
                            model.getMaximumAmount()));
                }
                break;
            } catch (NumberFormatException nfe) {
                view.display("A number is required.");
            } catch (IllegalArgumentException iae) {
                view.display(iae.getMessage());
            }
        }
        tries++;
    }

    public boolean isWon() {
        return guess == model.getCurrentAmount();
    }

    public void displayHint() {
        if (guess > model.getCurrentAmount()) {
            view.display("Guess to high.");
        } else {
            view.display("Guess too low.");
        }
    }

    public void displayResults() {
        view.display(tries);
    }

}