import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class InterfaceCommandes {

    private Scanner keyboard;
    private Random random;

    public InterfaceCommandes() {
        keyboard = new Scanner(System.in);
        random = new Random();
    }

    public void runGame() {
        ArrayList<Integer> nombres = new ArrayList<Integer>();
        int choix = 0;
        int tentative = 0;
        int reponse = random.nextInt(100) + 1;

        while (true) {

            choix = keyboard.nextInt();
            nombres.add(choix);
            System.out.println("Tu as choisis : " + choix);
            System.out.println("Voici les nombres déjà saisis : " + nombres);

            tentative++;

            if (choix == reponse) {
                System.out.println("Félicitation, vous avez réussi !");
                System.out.println("C'est votre : " + " " + tentative + " " + " tentative(s)");
                System.out.println("Voulez-vous rejouer? Y pour continuer ou N pour quitter");

                if (keyboard.next().equals("y")) {
                    System.out.println("Veuillez saisir un entier aléatoirement jusqu'à trouver le bon.\n" +
                            "Sinon tapez juste 0 pour arrêter la partie\n");
                    reponse = random.nextInt(100);
                    tentative = 0;

                } else {
                    System.exit(0);
                }

            } else if (choix == 0) {
                System.exit(0);

            } else if (choix > reponse) {
                System.out.println("Le nombre est plus petit !");

            } else {
                System.out.println("Le nombre est plus grand !");
            }
            System.out.println("C'est votre : " + " " + tentative + " " + " tentative(s)");
        }
    }




}
