package tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        System.out.println("===== Mobil =====");
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2020);
        mobil1.tampilkanInfo();
        mobil1.nyalakanMobil();

        // Membuat objek Mahasiswa
        System.out.println("\n===== Mahasiswa ===== ");
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "Teknik Informatika", 123456);
        mahasiswa1.tampilkanInfo();
        mahasiswa1.ubahJurusan("Sistem Informasi");

        // Membuat objek Buku
        System.out.println("\n===== Buku =====");
        Buku buku1 = new Buku("Pemrograman Java", "John Doe", 2019);
        buku1.tampilkanInfo();
        buku1.bacaBuku();

        // Membuat objek Laptop
        System.out.println("\n===== Laptop =====");
        Laptop laptop1 = new Laptop("Dell", "Intel Core i7", 16);
        laptop1.tampilkanSpesifikasi();
        laptop1.nyalakanLaptop();

        // Membuat objek Hewan
        System.out.println("\n===== Hewan =====");
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", 3);
        hewan1.tampilkanInfo();
        hewan1.bersuara();
    }
}
