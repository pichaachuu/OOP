package jobsheet01.praktikkum02;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2;
        String operator;
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan operator (+ - * /): ");
        operator = input.nextLine();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();
        input.nextLine();

        hitung(angka1, angka2, operator);
        input.close();
    }
    public static void hitung(double angka1, double angka2, String operator){
        double hasil;
        if (operator.equals("+")) {
            hasil = angka1 + angka2;
        } else if (operator.equals("-")) {
            hasil = angka1 - angka2;
        } else if (operator.equals("*")) {
            hasil = angka1 * angka2;
        } else if (operator.equals("/")) {
            hasil = angka1 / angka2;
        } else {
            System.out.println("Opetor salah, harap input operator dengan benar");
            return;
        }

        System.out.println("Hasil perhitungan adalah " + hasil);
    }
}
