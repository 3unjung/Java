public class ComteHarebourg extends Personnage {

    public ComteHarebourg() {
        this.hp = 1000;
        this.intelligence = 200;
    }

    public void contretemps() {
        System.out.println("Le Comte Harebourg lace Contretemps !");
        this.hp -= 70;
    }

    public void jaquemart() {
        System.out.println("Le Comte Harebourg lance Jaquemart !");
        this.hp -= 70;
    }

    private void Horaire() {
        // du code
    }
}
