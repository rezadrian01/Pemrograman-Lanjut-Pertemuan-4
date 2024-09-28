package tugas;

public class Mobil {
    // Properti
    String merk;
    String warna;
    int tahunProduksi;

    // Constructor
    public Mobil(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Mobil Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    // Method untuk menyalakan mobil
    public void nyalakanMobil() {
        System.out.println("Mobil " + merk + " dinyalakan.");
    }
}
