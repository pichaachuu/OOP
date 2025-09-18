package jobsheet04.tugas;

public class Rentaldemo {
    public static void main(String[] args) {
        Mobil car1 = new Mobil("N 3421 AB", "Toyota", "Avanza",true);
        Mobil car2 = new Mobil("N 8756 EF", "Honda", "Brio", true);

        Customer cust1 = new Customer("Aaliyah", "01");
        TransaksiRental t1 = new TransaksiRental("T001", cust1, car2, 2, 75000);
        cust1.tambahTransaksi(t1);
        TransaksiRental t2 = new TransaksiRental("T002", cust1, car1, 1, 100000);
        cust1.tambahTransaksi(t2);

        cust1.tampilkanTransaksi();

        car1.tampilkanInfo();
        car2.tampilkanInfo();
        
    }
}
