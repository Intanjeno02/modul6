package Rental;

public class Mobil extends Kendaraan{
    int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public double hitungHargaSewa(int hari){
        double total = super.hitungHargaSewa(hari);
        total = (hari + 50000) + total;

        if (kapasitasPenumpang > 5){
            total = total + 50000;
        }

        return total;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas penumpang : " + kapasitasPenumpang);
    }

}
