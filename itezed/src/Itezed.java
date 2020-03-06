import java.util.Scanner;

public class Itezed extends Personnage {
    Personnage gf;
    int cuddle = 0;
    double lovePourcent;

    public void setGirlfriend(Personnage newGf) {
        this.gf = newGf;
    }

    public void makeCuddle() {
        System.out.println("a big hub for u ♥");
    }

    public void askForLove() {

        System.out.println("Enter a decimal number please :");
        Scanner keyboard = new Scanner(System.in);
        this.lovePourcent = keyboard.nextDouble();
        System.out.println("the Itezed's amour pourcentage is equal to" + " " + this.lovePourcent + "%");
    }

    public void hug() {

        if (this.lovePourcent == 100) {
            this.cuddle = 0;
            System.out.println("Itezed will pregnant you now");

        } else if (this.lovePourcent >= 50 && this.lovePourcent < 100) {
            this.cuddle++;
            System.out.println("Itezed hold you and you receview a hug");

        } else {
            System.out.println("You should love Itezed more");
        }
    }
}
