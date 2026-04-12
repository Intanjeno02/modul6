package perusahaan; //package bernama perusahaan yang berisi kelas Karyawan, Developer, dan Manager

public class Karyawan { //superclass bernama karyawan dengan menerapkan encapsulation
    private String idKaryawan; //semua atribut bersifat private untuk menerapkan encapsulation
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    public Karyawan(String nama,String idKaryawan, int tahunMasuk, double ratingKinerja, double gajiPokok){ //konstruktor untuk menginisialisasi semua atribut
        this.idKaryawan = idKaryawan; // inisialisasi
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        this.ratingKinerja = ratingKinerja;
    }

    public String getIdKaryawan() { //fungsi untuk mendapatkan ID karyawan
        return idKaryawan;// mengembalikan ID karyawan
    }

    public void setIdKaryawan(String idKaryawan) { //fungsi untuk mengatur ID karyawan
        this.idKaryawan = idKaryawan; // mengatur ID karyawan
    }

    public String getNama() { //fungsi untuk mendapatkan nama karyawan
        return nama; // mengembalikan nama karyawan
    }

    public void setNama(String nama) { //fungsi untuk mengatur nama karyawan
        this.nama = nama; // mengatur nama karyawan
    }

    public int gettahunMasuk() { //fungsi untuk mendapatkan tahun masuk karyawan
        return tahunMasuk; // mengembalikan tahun masuk karyawan
    }

    public void settahunMasuk(int tahunMasuk) { //fungsi untuk mengatur tahun masuk karyawan
        this.tahunMasuk = tahunMasuk; // mengatur tahun masuk karyawan
    }

    public double getgajiPokok() { //fungsi untuk mendapatkan gaji pokok karyawan
        return gajiPokok; // mengembalikan gaji pokok karyawan
    }

    public void setgajiPokok(double gajiPokok) { //fungsi untuk mengatur gaji pokok karyawan
        this.gajiPokok = gajiPokok; // mengatur gaji pokok karyawan
    }

    public double getratingKinerja() { //fungsi untuk mendapatkan nilai rating kinerja karyawan
        return ratingKinerja; // mengembalikan nilai rating kinerja karyawan
    }

    public void setratingKinerja(double ratingKinerja) { //fungsi untuk mengatur nilai rating kinerja karyawan dengan validasi untuk memastikan rating berada dalam rentang 1.0 hingga 5.0
        this.ratingKinerja = ratingKinerja; 

        if(ratingKinerja < 1.0 || ratingKinerja > 5.0) { // validasi untuk memastikan rating kinerja berada dalam rentang 1.0 hingga 5.0
            System.out.println("Rating tidak valid. Rating diubah menjadi 3.0."); // jika rating tidak valid, maka akan diubah menjadi 3.0
            this.ratingKinerja = 3.0; // default rating jika input tidak valid adalah 3.0
        }
    }

    public double hitunggajiTotal() { //fungsi untuk menghitung total gaji dengan bonus berdasarkan masa kerja dan rating kinerja
        int masaKerja = 2026 - tahunMasuk; // menghitung masa kerja berdasarkan tahun masuk
        double bonus = masaKerja * 0.05 * gajiPokok; // bonus sebesar 5% dari gaji pokok untuk setiap tahun masa kerja
        double totalGaji = gajiPokok + bonus; // total gaji adalah gaji pokok ditambah bonus
        if (ratingKinerja < 2.5){ // jika rating kinerja kurang dari 2.5 maka total gaji dikurangi 10% sebagai penalti
            totalGaji = totalGaji - (0.1 * totalGaji); // penalti 10% dari total gaji jika rating kinerja kurang dari 2.5
        }

        return totalGaji; // mengembalikan total gaji setelah perhitungan bonus dan penalti
    }

    public void displayInfo() { //fungsi untuk menampilkan informasi lengkap tentang karyawan   
        System.out.println("ID Karyawan: " + idKaryawan); // menampilkan ID karyawan
        System.out.println("Nama Karyawan: " + nama); // menampilkan nama karyawan
        System.out.println("Tahun Masuk Karyawan: " + tahunMasuk); // menampilkan tahun masuk karyawan
        System.out.println("Rating Kinerja Karyawan: " + ratingKinerja); // menampilkan rating kinerja karyawan
        System.out.println("Gaji Pokok Karyawan: " + gajiPokok); // menampilkan gaji pokok karyawan
    }

}
