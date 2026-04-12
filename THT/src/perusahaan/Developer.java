package perusahaan;

public class Developer extends Karyawan { //mewarisi kelas Karyawan
    private String level; // atribut private buat lecel junior, mid dan senior
    private int jumlahbugFix;

   public Developer(String nama,String idKaryawan, int tahunMasuk, double ratingKinerja, double gajiPokok, String level, int jumlahbugFix) {
        super(nama, idKaryawan, tahunMasuk, ratingKinerja, gajiPokok);
        this.level = level;
        this.jumlahbugFix = jumlahbugFix;
    }

    @Override // digunakan untuk mengubah isi hitunggajiTotal dengan method yang sudah ada di kelas Karyawan
    public double hitunggajiTotal() {
        double total = super.hitunggajiTotal();

        //junior tidak dapat tunjangan
        if (level.equalsIgnoreCase("Mid")) {
            total = total +1500000; // tunjangan untuk level mid
        } else if (level.equalsIgnoreCase("Senior")) {
            total = total + 3000000; // tunjangan untuk level senior
        }

        if (getratingKinerja() >= 3.0) { // jika rating kinerja lebih dari 3.0 maka dapet bonus bug
            total = total + (jumlahbugFix * 50000); // bonus bug dengan harga 50000 per jumlahbugfix
        }

        return total;
    }

    @Override // digunakan untuk mengubah isi displayInfo dengan method yang sudah ada di kelas Karyawan
    public void displayInfo() { //method untuk menampilkan informasi lengkap tentang developer, termasuk level, jumlah bug fix, dan total gaji
        super.displayInfo();
        System.out.println("Level          : " + level); // menampilkan level
        System.out.println("Jumlah Bug Fix : " + jumlahbugFix); // menampilkan jumlah bug fix
        System.out.println("Total Gaji     : " + hitunggajiTotal()); // menampilkan total gaji 
    }
}
