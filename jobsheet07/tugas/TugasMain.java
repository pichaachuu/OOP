package jobsheet07.tugas;

public class TugasMain {
    public static void main(String[] args) {
        Makanan snack = new Makanan("Keripik Singkong", 15000, 50, "10-12-2025");
        System.out.println("\nInformasi Produk:");
        System.out.println(snack.getInfo());
    }
}
