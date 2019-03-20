public interface View {

    String askItemName();
    int askMaximumAmount();
    int askGuess();


//    public void promptForGuess() {
//        System.out.printf("How many %s are in the model? Pick a number between 1 and %d.%n",
//                model.getItemName(),
//                model.getMaximumAmount());
//        int guess;
//        while (true) {
//            try {
//                guess = validate(scanner.nextLine());
//                break;
//            } catch (IllegalArgumentException iae) {
//                System.out.print(iae.getMessage());
//            }
//        }
//        model.applyGuess(guess);
//    }
//
//    private int validate(String input) {
//        int guess;
//        if (input.length() == 0) {
//            throw new IllegalArgumentException(String.format("Please provide input.%n"));
//        }
//        try {
//            guess = Integer.parseInt(input);
//        } catch (NumberFormatException nfe) {
//            throw new IllegalArgumentException(String.format("Please provide a number.%n"));
//        }
//        if (guess > model.getMaximumAmount()) {
//            throw new IllegalArgumentException(String.format("Please provide a number between 1 and %s.%n",
//                    model.getMaximumAmount()));
//        }
//        return guess;
//    }
//
//
//    public void displayResult() {
//        int tries = model.getTries();
//        System.out.printf("Congratulations, it took you %d %s.",
//                tries,
//                tries == 1 ? "try" : "tries");
//    }


}