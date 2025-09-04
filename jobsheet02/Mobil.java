package jobsheet02;

public class Mobil {
    public String merk;
    public String warna;
    public String jenis;
    public double kecepatan;
    public int tahun;

    public void nyalakanMesin(){
        System.out.println("Mesin telah nyala");
    }

    public void matikanMesin(){
        kecepatan = 0;
        System.out.println("Mesin telah mati");
    }

    public void klakson(){
        System.out.println("BIIP BIIP BIIP");
    }

    public void rem(){
        kecepatan = 0;
        System.out.println("Mobil telah berhenti, kecepatan = " + kecepatan);
    }

    public void displayInfo(){
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Jenis       : " + jenis);
        System.out.println("Tahun       : " + tahun);
        System.out.println("Kecepatan   : " + kecepatan);
    }
}
