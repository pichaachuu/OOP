package jobsheet04.tugas;
import java.util.ArrayList;
public class Customer {
    private String nama;
    private String idCustomer;
    private ArrayList<TransaksiRental> daftarTransaksi;

    public Customer(String nama, String idCustomer){
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.daftarTransaksi = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getIdCustomer(){
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer){
        this.idCustomer = idCustomer;
    }

    public void tambahTransaksi(TransaksiRental t){
        daftarTransaksi.add(t);
    }

    public void tampilkanTransaksi() {
        System.out.println("Daftar Transaksi Customer: " + nama);
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (TransaksiRental t : daftarTransaksi) {
                t.tampilkanDetail();
            }
        }
    }
}
