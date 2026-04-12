import java.util.ArrayList;
import perusahaan.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> daftar = new ArrayList<>(); // buat objek ArrayList untuk menyimpan daftar karyawan

        //Objek 1: Karyawan biasa, masuk tahun 2020, rating 2.0 (Harus terkena penalti).  
        daftar.add(new Karyawan("cipuy", "1006776", 2020, 2.0, 500000)); // isi urut berdasarkan (String idKaryawan, String nama, int tahunMasuk)
        // Objek 2: Developer "Senior", masuk 2018, rating 4.0, menyelesaikan 20 bug (Bonus maksimal).
        daftar.add(new Developer("ttrewc", "1096287373", 2018, 4.0, 650000, "Senior", 20)); // isi urut berdasarkan (String nama, double gajiPokok, int tahunMasuk, double ratingKinerja, String level, int jumlahbugFix)
        // Objek 3: Developer "Mid", masuk 2024, rating 2.8, menyelesaikan 15 bug (Bonus bug hangus karena rating < 3.0). 
        daftar.add(new Developer("serttyw", "1096287374", 2024, 2.8, 550000, "Mid", 15));
        // Objek 4: Manajer divisi "IT", masuk 2015, rating 4.8, memimpin 10 anggota tim (Mendapat bonus kinerja ekstra 15%). 
        daftar.add(new Manager("gon zalez", "100667222", 2015, 4.8, 700000, "IT", 7)); // isi urut berdasarkan (String nama, double gajiPokok, int tahunMasuk, double ratingKinerja, String divisi, int jumlahAnggotaTim)
        // Objek 5: Manajer divisi "HR", masuk 2025, rating 3.5, memimpin 3 anggota tim (Tunjangan manajerial biasa).
        daftar.add(new Manager("cytr", "100667223", 2025, 3.5, 750000, "HR", 3));

        double totalGaji = 0; // variabel untuk menghitung total gaji semua karyawan
        double totalRating = 0; // variabel untuk menghitung total rating semua karyawan

        Karyawan tertinggi = null; // variabel untuk menyimpan karyawan dengan gaji tertinggi, diinisialisasi dengan null

        for (Karyawan k : daftar) { // loop untuk setiap karyawan dalam daftar
            k.displayInfo(); // memanggil method displayInfo() untuk menampilkan informasi karyawan
            // k adalah variabel sementara untuk menampung tiap item dalam daftar selama loop berjalan

            double gaji = k.hitunggajiTotal(); // buat manggil method hitungGajiTotal() untuk ngitung total gaji karyawan saat ini dan nyimpennya dalam variabel gaji
            System.out.println("Total Gaji Bulan Ini: Rp " + gaji); // menampilkan total gaji bulan ini untuk karyawan saat ini
            System.out.println("---------------------------");

            totalGaji = totalGaji + gaji; //total anggaram gaji perusahaan
            totalRating = totalRating + k.getratingKinerja(); // ratra-rata rating kinerja semua karyawan

            if (tertinggi == null || gaji > tertinggi.hitunggajiTotal()) { //fungsi untuk mencari gaji tertinggi
                tertinggi = k; 
            }
        }

        System.out.println("Total Anggaran Gaji: Rp " + totalGaji); // menampilkan total anggaran gaji untuk semua karyawan dengan mengakses variabel totalGaji yang sudah dihitung selama loop

        if (tertinggi != null) { // cek jika variabel tertinggi tidak null, artinya ada karyawan dalam daftar
            System.out.println("Gaji Tertinggi: " + tertinggi.getNama()); // menampilkan nama karyawan dengan gaji tertinggi dengan mengakses method getNama() dari objek tertinggi
        }

        double rataRating = totalRating / daftar.size(); // menghitung rata-rata rating dengan membagi total rating dengan jumlah karyawan dalam daftar
        System.out.println("Rata-rata Rating: " + rataRating); // menampilkan rata-rata rating kinerja semua karyawan
    }
}
