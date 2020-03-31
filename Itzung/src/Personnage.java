import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Personnage {
    protected int hp;
    protected int intelligence;
    protected int force;
    protected String spell1;
    protected String spell2;
    protected String spell3;

    public static void main(String[] args) {
        System.out.println(
                "Bienvenue sur ce jeu, vous être un personnage possèdent 100 hp, 0 force et 0 intel.\n" +
                        "L'ordinateur choisira un monstre aléatoirement et vous devez l'affronter.\n" +
                        "Si vous gagnez, vous prenez un niveau sinon...Entrainez-vous !");
        Personnage.runGame();


    }

    public static void runGame() {
        Random random = new Random(); // crée une nouvelle variable d'instance de la fonction random()

        /* crée une liste d'objet
         * prend la liste List et utilise la fonction add() pour mettre la classe Bouftou dedans
         * prend la liste List et utilise la fonction add() pour mettre la classe CompteHarebourg dedans
         * prend la liste List et utilise la fonction add() pour mettre la classe Blop dedans
         */

        List<Object> list = new ArrayList<>();
        list.add(new Bouftou());
        list.add(new ComteHarebourg());
        list.add(new Blop());
        int size = list.size();
        int choix = random.nextInt(size);

        if (random.nextInt(size) == 1) {
            System.out.println("Vous allez affronter un bouftou !");
        }

        else if (random.nextInt(size) == 2) {
            System.out.println("Vous allez affronter le Comte Harebourg !");
        }

        else {
            System.out.println("Vous allez affronter un blop !");
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Vous êtes prêt ? y/n");

        if(keyboard.next().equals("y")) {
            System.out.println("Le combat commence !");

        } else {
            System.out.println("Vous prenez la fuite...");
            System.exit( 0);
        }
    }

}
