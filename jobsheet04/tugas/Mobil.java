package jobsheet04.tugas;

import javax.management.monitor.StringMonitor;

public class Mobil {
    private String platNomor;
    private String merk;
    private String tipe;
    private boolean statusTersedia;

    public Mobil(String platNomor, String merk, String tipe, boolean statusTersedia){
        this.platNomor = platNomor;
        this.merk = merk;
        this.tipe = tipe;
        this.statusTersedia = statusTersedia;
    }

    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }

    public String getMerk(){
        return merk;
    }

    public void setMerek(String merk){
        this.merk = merk;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTTipe(String tipe){
        this.tipe = tipe;
    }

    public boolean getStatus(){
        return statusTersedia;
    }

    public void setStatus(boolean statusTersedia){
        this.statusTersedia = statusTersedia;
    }

    public void tampilkanInfo(){
        System.out.println("Mobil   : " + merk);
        System.out.println("Tipe    : " + tipe);
        System.out.println("Plat    : " + platNomor);
        System.out.println("Status  : " + (statusTersedia ? "Tersedia" : "Disewa"));
    }
}
