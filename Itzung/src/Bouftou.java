import java.util.Random;

public class Bouftou extends Personnage {

    public Bouftou() {
        Random random = new Random();
        this.hp = 400;
        this.force = 100;
    }

    public void morsure() {

        System.out.println("Bouftou apprivoisé de Margaux attaque avec Morsure du Bouftou");
        this.hp -= 50;
    }

    public void beeeh() {
        System.out.println("Bouftou apprivoisé de Margaux lance Beeeh !");
        this.hp += 50;
    }

    public void gueulement() {
      System.out.println("Bouftou apprivoisé de Margaux lance Gueulement !");
      // -5% de dégât

    }
}
