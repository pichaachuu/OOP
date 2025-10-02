package jobsheet06.percobaan06;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn){
        System.out.println("Objek dari class dosen dibuat dengan parameter");
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += "NIDN : " + nidn;
        return info;
    }
}

