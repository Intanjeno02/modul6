package game;

public class Hero {
    String nama;
    double health;
    double attackPower;

    public Hero(String nama, double health, double attackPower){
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display(){
        System.out.println("Nama        : " + nama);
        System.out.println("Health      : " + health);
        System.out.println("AttackPower : " + attackPower);
    }

    public void berlatih(){
        System.out.println(nama + " sedang berlatih...");
        attackPower = attackPower + 10;
        System.out.println("AttackPower sekarang: " + attackPower);
    }

    public void terimaSerangan(double damage){
        System.out.println(nama + " menerima damage: " + damage);
        this.health = this.health - damage;
    }
    
}
