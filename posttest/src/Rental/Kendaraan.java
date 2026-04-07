package Rental;

public class Kendaraan {
    String nomorPolisi;
    String Merk;
    int tahunProduksi;
    double hargaSewaDasar;

    public Kendaraan(String nomorPolisi, String Merk, int tahunProduksi, double hargaSewaDasar){
        this.nomorPolisi = nomorPolisi;
        this.Merk = Merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo(){
        System.out.println("Tampilan Detail Data :");
        System.out.println("Nomor polisi :" + nomorPolisi);
        System.out.println("Merk kendaraan :" + Merk);
        System.out.println("Tahun produksi :" + tahunProduksi);
        System.out.println("Harga sewa dasar :" + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari) {
    double total = hargaSewaDasar * hari;

    if (tahunProduksi < 2015) {
        total *= 0.9;
    }

    return total;
}
}
