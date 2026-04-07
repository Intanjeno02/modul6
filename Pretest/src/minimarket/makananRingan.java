package minimarket;

public class makananRingan extends Produk {
    String rasa;

    public makananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Rasa  : " + rasa);
    }
}