package game;

public class HeroStrength extends Hero {
    String tipe = "Strength"; 

    public HeroStrength(String nama, double health, double attackPower){
        super(nama, health, attackPower);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Tipe        : " + tipe);
        System.out.println("----------------------");
    }

    @Override
    public void terimaSerangan(double damage){
        double damageDiterima = damage * 0.5;
        System.out.println(nama + " menerima damage (setelah defense): " + damageDiterima);
        double sisaHealth = health - damageDiterima;
        health = sisaHealth;
    }
}