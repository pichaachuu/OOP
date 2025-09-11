package jobsheet03.tugas;

public class Anggota {
    private String nik;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nik, String nama, int limitPinjaman){
        this.nik = nik;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String nik(){
        return nik;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah){
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah){
        if (jumlah <= 0) {
            System.out.println("Angsuran harus lebih dari 0.");
        } else if (jumlah > jumlahPinjaman) {
            System.out.println("Angsuran melebihi jumlah pinjaman. Angsuran ditolak.");
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
}
