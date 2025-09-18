package jobsheet04.tugas;

public class TransaksiRental {
    private String idTransaksi;
    private Customer customer;
    private Mobil mobil;
    private int lamaSewa;
    private double hargaPerHari;
    private double totalBayar;

    public TransaksiRental(String idTransaksi, Customer customer, Mobil mobil, int lamaSewa, double hargaPerHari){
        this.idTransaksi = idTransaksi;
        this.customer = customer;
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
        this.hitungTotal(hargaPerHari);
        mobil.setStatus(false);
    }

    public String getId(){
        return idTransaksi;
    }

    public void setId(String idTransaksi){
        this.idTransaksi = idTransaksi;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Mobil getMobil(){
        return mobil;
    }

    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }

    public int setHari(){
        return lamaSewa;
    }

    public void setLamaHari(int lamaSewa){
        this.lamaSewa = lamaSewa;
    }

    public void setHargaPerhari(double hargaPerhari){
        this.hargaPerHari = hargaPerhari;
    }

    public double getHarga(){
        return hargaPerHari;
    }

    public void hitungTotal(double hargaPerHari){
        this.totalBayar = lamaSewa * hargaPerHari;
    }

    public void tampilkanDetail() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Customer     : " + customer.getNama());
        System.out.println("Mobil        : " + mobil.getMerk());
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Bayar  : Rp" + totalBayar);
        System.out.println("-----------------------------------");
    }
}
