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
