Berikut adalah perbaikan dari tugas Polymorfisme.

1. Class Keluarga

// File: Keluarga.java

package TugasKeluarga;

// Kelas induk untuk mendefinisikan anggota keluarga
class Keluarga {
    private String nama; // Nama anggota keluarga
    private int umur; // Umur anggota keluarga

    // Konstruktor untuk menginisialisasi nama dan umur
    public Keluarga(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter untuk mendapatkan nilai nama
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan nilai umur
    public int getUmur() {
        return umur;
    }

    // Method overloading: perkenalan tanpa parameter tambahan
    public void perkenalan() {
        System.out.println("Halo, nama saya " + nama + " dan umur saya " + umur + " tahun.");
    }

    // Method overloading: perkenalan dengan parameter pekerjaan
    public void perkenalan(String pekerjaan) {
        System.out.println("Halo, nama saya " + nama + ", saya bekerja sebagai " + pekerjaan + ".");
    }

    // Method yang akan di-override oleh subclass
    public void aktivitas() {
        System.out.println(nama + " melakukan aktivitas sehari-hari.");
    }
}

// Subclass Bapak yang mewarisi dari Keluarga
class Bapak extends Keluarga {
    // Konstruktor untuk Bapak yang memanggil konstruktor Keluarga
    public Bapak(String nama, int umur) {
        super(nama, umur); // Memanggil konstruktor dari kelas induk
    }

    // Method overriding: mendefinisikan aktivitas khusus untuk Bapak
    @Override
    public void aktivitas() {
        System.out.println(getNama() + " bekerja di kantor sebagai PNS.");
    }
}

// Subclass Ibu yang mewarisi dari Keluarga
class Ibu extends Keluarga {
    // Konstruktor untuk Ibu yang memanggil konstruktor Keluarga
    public Ibu(String nama, int umur) {
        super(nama, umur); // Memanggil konstruktor dari kelas induk
    }

    // Method overriding: mendefinisikan aktivitas khusus untuk Ibu
    @Override
    public void aktivitas() {
        System.out.println(getNama() + " mengurus rumah tangga dan anak-anak.");
    }
}

// Subclass Anak yang mewarisi dari Keluarga
class Anak extends Keluarga {
    // Konstruktor untuk Anak yang memanggil konstruktor Keluarga
    public Anak(String nama, int umur) {
        super(nama, umur); // Memanggil konstruktor dari kelas induk
    }

    // Method overriding: mendefinisikan aktivitas khusus untuk Anak
    @Override
    public void aktivitas() {
        System.out.println(getNama() + " belajar dan bermain dengan teman-teman.");
    }
}

2. Class KeluargaDemo

package TugasKeluarga;

public class KeluargaDemo {
    public static void main(String[] args) {
        // Membuat objek dari setiap anggota keluarga
        Keluarga bapak = new Bapak("Budi", 45);
        Keluarga ibu = new Ibu("Ani", 40);
        Keluarga anak = new Anak("Andi", 10);

        // Memanggil metode perkenalan dan aktivitas untuk Bapak
        bapak.perkenalan();
        bapak.perkenalan("Pegawai Negeri Sipil"); // Memanggil metode perkenalan yang di-overload
        bapak.aktivitas(); // Memanggil metode aktivitas yang di-override

        // Memanggil metode perkenalan dan aktivitas untuk Ibu
        ibu.perkenalan();
        ibu.perkenalan("Ibu Rumah Tangga"); // Memanggil metode perkenalan yang di-overload
        ibu.aktivitas(); // Memanggil metode aktivitas yang di-override

        // Memanggil metode perkenalan dan aktivitas untuk Anak
        anak.perkenalan();
        anak.perkenalan("Pelajar"); // Memanggil metode perkenalan yang di-overload
        anak.aktivitas(); // Memanggil metode aktivitas yang di-override
    }
}
