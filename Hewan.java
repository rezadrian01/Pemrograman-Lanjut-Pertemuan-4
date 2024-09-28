package tugas;

// Class untuk merepresentasikan Hewan
public class Hewan {
    // Properti
    String nama;
    String jenis;
    int umur;

    // Constructor
    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Method untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Umur: " + umur + " tahun");
    }

    // Method untuk membuat hewan bersuara
    public void bersuara() {
        System.out.println(nama + " sedang bersuara.");
    }
}
