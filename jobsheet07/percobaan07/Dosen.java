package jobsheet07.percobaan07;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn){
       super(nip, nama, gaji);
       this.nidn = nidn;
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += "NIDN : " + nidn;
        return info;
    }
}

