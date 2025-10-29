package jobsheet09.tugas;

public class PembayaranKartuKredit extends Pembayaran {
    private String nomorKartu;

    public PembayaranKartuKredit(double jumlah, String nomorKartu) {
        super(jumlah);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran kartu kredit dengan nomor: " + nomorKartu);
        System.out.println("Pembayaran sebesar Rp" + jumlah + " berhasil menggunakan kartu kredit.");
    }
}