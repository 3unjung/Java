public class Joueur {
    int hp = 1000;
    int intelligence = 0;
    int force = 0;
    int exp = 0;

    public void punch() {
        System.out.println("Vous utilisez Coup de poing !");
    }

    public void seduction() {
        System.out.println("Vous utilisez Seduction !");
        this.hp += 30;
    }

    public void tranche() {
        System.out.println("Vous utilisez Trancher !");
    }
}
