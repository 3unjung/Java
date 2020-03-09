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
    }
}
