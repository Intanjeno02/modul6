import game.HeroStrength;
import game.Hero;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Aldous", 100, 30);
        Hero hero2 = new Hero("Miya", 80, 25);

        System.out.println("=== SEBELUM LATIHAN ===");
        hero1.display();

        hero1.berlatih();
        hero2.berlatih();

        System.out.println("=== SETELAH LATIHAN ===");
        hero1.display();
        hero2.display();

        hero1.terimaSerangan(60);
        hero1.terimaSerangan(40);

        System.out.println("=== STATUS MUSUH ===");
        hero2.display();
    }
}
