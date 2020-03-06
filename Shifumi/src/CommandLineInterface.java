import java.util.Random;
import java.util.Scanner;

public class CommandLineInterface {
    private Random random;
    private Scanner keyboard;

    // constructor
    public CommandLineInterface() {
        keyboard = new Scanner(System.in);
        random = new Random();

    }

    public void runGame() {
        int choice = 1;
        while (choice != 0) {
            choice = keyboard.nextInt();

            System.out.println("You chose : " + choice);

            int response = random.nextInt(3) + 1;
            System.out.println("Computer has choice : " + response);

            if (choice == 1 && response == 1) {
                System.out.println("Equality...!\n");
            } else if (choice == 1 && response == 2) {
                System.out.println("You win...\n");
            } else if (choice == 1 && response == 3) {
                System.out.println("You lost...\n");
            } else if (choice == 2 && response == 1) {
                System.out.println("You win ...\n");
            } else if (choice == 2 && response == 2) {
                System.out.println("Equality...!\n");
            } else if (choice == 2 && response == 3) {
                System.out.println("You win...\n");
            } else if (choice == 3 && response == 1) {
                System.out.println("You lost...\n");
            } else if (choice == 3 && response == 2) {
                System.out.println("You win...\n");
            } else if (choice == 3 && response == 3) {
                System.out.println("Equality...!\n");
            }
            System.out.println("Welcome to shifumi game !" +
                    "\nYou play vs the machine." +
                    "\nEnter 1 for rock." +
                    "\nEnter 2 for paper." +
                    "\nEnter 3 for scissors." +
                    "\nOr enter 0 for leave the party.");
        }

    }

}


