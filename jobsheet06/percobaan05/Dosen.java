package jobsheet06.percobaan05;


public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(){
        System.out.println("Objek dari class dosen dibuat");
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += "NIDN : " + nidn;
        return info;
    }
}


