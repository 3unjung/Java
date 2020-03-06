import java.util.ArrayList;

public class Pizza {
    public static void main(String[] args) {
        System.out.println("" +
                "Bienvenue dans ce nouveau jeu, les règles sont simples.\n" +
                "L'ordinateur choisis un nombre entre 0-100.\n" +
                "Si le nombre saisis est  bon, vous avez gagné.\n" +
                "Sinon si ce nombre est trop petit ou il est trop grand. \n" +
                "Vous pouvez réessayer ou abandonner jusqu'à trouver.\n" +
                "Veuillez saisir un entier aléatoirement jusqu'à trouver le bon.\n" +
                "Sinon tapez juste 0 pour arrêter la partie\n");
        new InterfaceCommandes().runGame();

    }
}

