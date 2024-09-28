package tugas;

// Class untuk merepresentasikan Laptop
public class Laptop {
    // Properti
    String merk;
    String prosesor;
    int ram;

    // Constructor
    public Laptop(String merk, String prosesor, int ram) {
        this.merk = merk;
        this.prosesor = prosesor;
        this.ram = ram;
    }

    // Method untuk menampilkan spesifikasi laptop
    public void tampilkanSpesifikasi() {
        System.out.println("Laptop Merk: " + merk);
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ram + "GB");
    }

    // Method untuk menyalakan laptop
    public void nyalakanLaptop() {
        System.out.println("Laptop " + merk + " dengan prosesor " + prosesor + " dinyalakan.");
    }
}
