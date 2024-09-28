package tugas;

// Class untuk merepresentasikan Mahasiswa
public class Mahasiswa {
    // Properti
    String nama;
    String jurusan;
    int nim;

    // Constructor
    public Mahasiswa(String nama, String jurusan, int nim) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.nim = nim;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("NIM: " + nim);
    }

    // Method untuk mengubah jurusan
    public void ubahJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
        System.out.println("Jurusan diubah menjadi: " + jurusanBaru);
    }
}
