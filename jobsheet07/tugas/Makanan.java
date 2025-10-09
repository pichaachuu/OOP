package jobsheet07.tugas;

public class Makanan extends Produk {
    public String kadaluarsa;

    // Constructor tanpa parameter
    public Makanan() {
        super(); // panggil constructor Produk tanpa parameter
        System.out.println("Objek Makanan dibuat (tanpa parameter)");
    }

    // Constructor dengan parameter
    public Makanan(String nama, double harga, int stok, String kadaluarsa) {
        super(nama, harga, stok); // panggil constructor Produk dengan parameter
        this.kadaluarsa = kadaluarsa;
        System.out.println("Objek Makanan dibuat (dengan parameter)");
    }

    // Method overriding
    public String getAllInfo() {
       String info = getInfo();
       info += "Tanggal Kadaluarsa: " + kadaluarsa + "\n";
       return info;
    }
}