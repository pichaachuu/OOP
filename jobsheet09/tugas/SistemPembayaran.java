package jobsheet09.tugas;

public class SistemPembayaran {
    public static void main(String[] args) {
        PembayaranKartuKredit bayar1 = new PembayaranKartuKredit(500000, "1234-5678-9012-3456");
        PembayaranDebit bayar2 = new PembayaranDebit(250000, "09284013");

        bayar1.tampilkanJumlah();
        bayar1.prosesPembayaran();

        System.out.println();

        bayar2.tampilkanJumlah();
        bayar2.prosesPembayaran();

    }
}

