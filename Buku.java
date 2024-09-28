package tugas;

// Class untuk merepresentasikan Buku
public class Buku {
    // Properti
    String judul;
    String penulis;
    int tahunTerbit;

    // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    // Method untuk membaca buku
    public void bacaBuku() {
        System.out.println("Membaca buku " + judul + " karya " + penulis);
    }
}
