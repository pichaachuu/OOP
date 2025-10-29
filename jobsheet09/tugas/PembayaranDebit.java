package jobsheet09.tugas;

public class PembayaranDebit extends Pembayaran{
    private String noRekening;

    public PembayaranDebit(double jumlah, String noRekening) {
        super(jumlah);
        this.noRekening = noRekening;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran melalui dompet digital: " + noRekening);
        System.out.println("Pembayaran sebesar Rp" + jumlah + " berhasil menggunakan dompet digital.");
    }

}

