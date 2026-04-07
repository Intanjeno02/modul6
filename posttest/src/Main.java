import Rental.*;

public class Main {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil("B 7974 ABC", "Toyota", 2013, 75000, 8);
        Mobil mobil2 = new Mobil("AB 9876 ASY", "Honda", 2019, 100000, 4);

        Motor motor1 = new Motor("J 2325 CV", "Nmax", 2024, 65000, 260);
        Motor motor2 = new Motor("K 4290", "Honda", 2020, 35000, 130);

        System.out.println("\n--- MOBIL 1 ---");
        mobil1.displayInfo();
        System.out.println("Total 5 hari: " + mobil1.hitungHargaSewa(5));

        System.out.println("\n--- MOBIL 2 ---");
        mobil2.displayInfo();
        System.out.println("Total 5 hari: " + mobil2.hitungHargaSewa(4));

        System.out.println("\n--- MOTOR 1 ---");
        motor1.displayInfo();
        System.out.println("Total 5 hari: " + motor1.hitungHargaSewa(3));

        System.out.println("\n--- MOTOR 2 ---");
        motor2.displayInfo();
        System.out.println("Total 5 hari: " + motor2.hitungHargaSewa(2));
    }
}