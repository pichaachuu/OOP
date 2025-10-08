package jobsheet06.percobaan07;

public class InheritanceDemo {
   public static void main(String[] args) {
        Dosen dosen1 = new Dosen("34329837", "Yansy Ayuningtyas", 3000000, "19894324837", "PBO");
        System.out.println(dosen1.getAllInfo());
        Dosen dosen2 = new Dosen("34329838", "Ahmad Fauzan", 3500000, "19894324838", "Basis Data");
        System.out.println(dosen2.getAllInfo());
   } 
}
