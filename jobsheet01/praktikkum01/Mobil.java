package jobsheet01.praktikkum01;

public class Mobil {
    
    public static void main(String[] args) {
        String mobil1, mobil2, mobil3, mobil4, mobil5, mobil6, mobil7, mobil8, mobil9, mobil10;
        String nyalaMesin1, nyalaMesin2, nyalaMesin3, nyalaMesin4, nyalaMesin5, nyalaMesin6, nyalaMesin7, nyalaMesin8, nyalaMesin9, nyalaMesin10;
        int kecepatan1, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6, kecepatan7, kecepatan8, kecepatan9, kecepatan10;


        mobil1 = "Avanza";
        kecepatan1 = 0;
        nyalaMesin1 = "off";

        mobil2 = "Xenia";
        kecepatan2 = 20;
        nyalaMesin2 = "on";
        tambahKecepatan(kecepatan2, 10);

        mobil3 = "Ertiga";
        nyalaMesin3 = "on";
        kecepatan3 = 30;
        rem(kecepatan3);

        mobil4 = "Innova";
        nyalaMesin4 = "off";
        kecepatan4 = 0;

        mobil5 = "Fortuner";
        nyalaMesin5 = "on";
        kecepatan5 = 40;
        tambahKecepatan(kecepatan5, 20);

        mobil6 = "Pajero";
        kecepatan6 = 0;
        nyalaMesin6 = "off";

        mobil7 = "CRV";
        kecepatan7 = 50;
        tambahKecepatan(kecepatan7, 10);
        rem(kecepatan7);
        nyalaMesin7 = "off";

        mobil8 = "Bentley";
        nyalaMesin8 = "on";
        kecepatan8 = 60;
        rem(kecepatan8);

        mobil9 = "Lamborghini";
        nyalaMesin9 = "on";
        kecepatan9 = 70;
        rem(kecepatan9);

        mobil10 = "Ferrari";
        nyalaMesin10 = "off";
        kecepatan10 = 0;

        System.out.println("Merk: " + mobil1);
        System.out.println("Kecepatan: " + kecepatan1);
        System.out.println("Mesin: " + nyalaMesin1);
        System.out.println();

        System.out.println("Merk: " + mobil2);
        System.out.println("Kecepatan: " + kecepatan2);
        System.out.println("Mesin: " + nyalaMesin2);
        System.out.println();

        System.out.println("Merk: " + mobil3);
        System.out.println("Kecepatan: " + kecepatan3);
        System.out.println("Mesin: " + nyalaMesin3);
        System.out.println();

        System.out.println("Merk: " + mobil4);
        System.out.println("Kecepatan: " + kecepatan4);
        System.out.println("Mesin: " + nyalaMesin4);
        System.out.println();

        System.out.println("Merk: " + mobil5);
        System.out.println("Kecepatan: " + kecepatan5);
        System.out.println("Mesin: " + nyalaMesin5);
        System.out.println();

        System.out.println("Merk: " + mobil6);
        System.out.println("Kecepatan: " + kecepatan6);
        System.out.println("Mesin: " + nyalaMesin6);
        System.out.println();

        System.out.println("Merk: " + mobil7);
        System.out.println("Kecepatan: " + kecepatan7);
        System.out.println("Mesin: " + nyalaMesin7);
        System.out.println();

        System.out.println("Merk: " + mobil8);
        System.out.println("Kecepatan: " + kecepatan8);
        System.out.println("Mesin: " + nyalaMesin8);
        System.out.println();

        System.out.println("Merk: " + mobil9);
        System.out.println("Kecepatan: " + kecepatan9);
        System.out.println("Mesin: " + nyalaMesin9);
        System.out.println();

        System.out.println("Merk: " + mobil10);
        System.out.println("Kecepatan: " + kecepatan10);
        System.out.println("Mesin: " + nyalaMesin10);
        System.out.println();

    }

    public static int tambahKecepatan(int kecepatan, int tambahan){
        kecepatan+=tambahan;
        return kecepatan;
    }

    public static void rem(int kecepatan){
        kecepatan=0;
    }
}
