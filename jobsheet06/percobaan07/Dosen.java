package jobsheet06.percobaan07;

public class Dosen extends Pegawai {
    public String nidn;
    public String matakuliah;

    public Dosen(String nip, String nama, double gaji, String nidn, String matakuliah){
        super(nip, nama, gaji);
        this.nidn = nidn;
        this.matakuliah = matakuliah;
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += "NIDN : " + nidn;
        info += "\nMata Kuliah : " + matakuliah;
        return info;
    }
}

