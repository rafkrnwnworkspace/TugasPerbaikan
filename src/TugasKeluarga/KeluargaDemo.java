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