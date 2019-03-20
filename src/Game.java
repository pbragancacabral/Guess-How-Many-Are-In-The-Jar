import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Jar jar = createJar();
        Prompter prompter = new Prompter(jar);
    }

    private static Jar createJar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What would you like to store in the jar? ");
        String itemName = scanner.nextLine();
        System.out.printf("What is the maximum capacity of %s in the jar? ", itemName);
        int many = scanner.nextInt();
        return new Jar(itemName, many);
    }

}