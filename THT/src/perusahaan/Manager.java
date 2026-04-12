package perusahaan;

public class Manager extends Karyawan{ //mewarisi kelas Karyawan
    private String divisi; // atribut private buat divisi tempat manager bekerja
    private int jumlahAnggotaTim; // atribut private buat jumlah anggota tim yang dipimpin manager

   public Manager(String nama, String idKaryawan, int tahunMasuk, double ratingKinerja, double gajiPokok, String divisi, int jumlahAnggotaTim) {
    super(nama, idKaryawan, tahunMasuk, ratingKinerja, gajiPokok);
    this.divisi = divisi;
    this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

   @Override
    public double hitunggajiTotal() { //method untuk menghitung total gaji manager 
    double total = super.hitunggajiTotal(); // memanggil method hitunggajiTotal() dari kelas Karyawan untuk mendapatkan gaji pokok

    // Tunjangan manajerial
    if (jumlahAnggotaTim > 0) {
        total = total + (jumlahAnggotaTim * 300000); // tunjangan manajerial dengan harga 300.000 per anggota tim
    }

    // Bonus kinerja ekstra
    if (getratingKinerja() > 4.5) {
        double bonus = total * 0.15; // bonus sebesar 15% dari total gaji jika rating kinerja lebih dari 4.5
        total = total + bonus;
    }

    return total; // mengembalikan total gaji manager
    }
}
