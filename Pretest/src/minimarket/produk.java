package minimarket;

public class Produk {
    String namaProduk;
    double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public void tampilkanDetail() {
        System.out.println("=== Detail Produk ===");
        System.out.println("Nama  : " + namaProduk);
        System.out.println("Harga : " + harga);
    }
}