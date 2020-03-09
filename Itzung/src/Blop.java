public class Blop extends Personnage {
    public Blop() {
        this.hp = 600;
        this.intelligence = 100;
    }

    public void Biblop() {
        System.out.println("Le blop attaque avec Biblop !");
        this.hp -= 35;
    }

    public void blopbib() {
        System.out.println("Le blop lance Blopblb !");
        this.hp += 30;
    }

    public void bibiblop() {
        // du code ici
    }


}
