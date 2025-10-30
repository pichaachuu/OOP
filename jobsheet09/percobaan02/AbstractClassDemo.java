package jobsheet09.percobaan02;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Hektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        Ular ular1 = new Ular(false, 1, "daging", "hutan");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}
