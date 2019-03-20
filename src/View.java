public interface View {

    String askItemName();
    String askMaximumAmount();
    String askGuess();
    void display(int tries);
    void display(String message);

}