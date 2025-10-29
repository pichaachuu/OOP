package jobsheet09.tugas;

public abstract class Pembayaran {
    public double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public abstract void prosesPembayaran();

    public void tampilkanJumlah() {
        System.out.println("Jumlah yang harus dibayar: Rp" + jumlah);
    }
}
