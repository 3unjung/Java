public class Shifumi {
    public static void main(String[] args) {
        System.out.println("Welcome to shifumi !" +
                "\nYou play vs the machine." +
                "\nEnter 1 for rock." +
                "\nEnter 2 for paper." +
                "\nEnter 3 for scissors." +
                "\nOr enter 0 for leave the party.");
        new CommandLineInterface().runGame(); // create a new instance of CommandLineInterface and call her function runGame
    }
}
