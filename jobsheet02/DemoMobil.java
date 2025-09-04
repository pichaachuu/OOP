package jobsheet02;

public class DemoMobil {
    public static void main(String[] args) {
        Mobil car1 = new Mobil();
        car1.merk = "Toyota";
        car1.warna = "Merah";
        car1.jenis = "SUV";
        car1.tahun = 2022;
        car1.nyalakanMesin();
        car1.klakson();
        car1.displayInfo();

        Mobil car2 = new Mobil();
        car2.merk = "Honda";
        car2.warna = "Putih";
        car2.jenis = "Sedan";
        car2.tahun = 2021;
        car2.kecepatan = 100;
        car2.displayInfo();
        car2.klakson();
        car2.rem();
        car2.matikanMesin();
    }
}
