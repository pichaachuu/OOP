package jobsheet07.tugas;

public class Produk {
    public String nama;
    public double harga;
    public int stok;

    // Constructor tanpa parameter
    public Produk() {
        System.out.println("Objek Produk dibuat (tanpa parameter)");
    }

    // Constructor dengan parameter
    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        System.out.println("Objek Produk dibuat (dengan parameter)");
    }

    // Method getInfo
    public String getInfo() {
        return "Nama Produk: " + nama + "\n" +
               "Harga: " + harga + "\n" +
               "Stok: " + stok + "\n";
    }
}
