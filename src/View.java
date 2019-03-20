public interface View {

    String askItemName();
    String askMaximumAmount(String itemName);
    String askGuess(String itemName);
    void display(int tries);
    void display(String message);

}