package jobsheet07.percobaan05;


public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(){
        System.out.println("Objek dari class dosen dibuat");
    }

    public String getInfo(){
        return "NIDN : " + this.nidn + "\n"; 
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}


