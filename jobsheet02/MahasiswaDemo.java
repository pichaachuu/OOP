package jobsheet02;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa ml = new Mahasiswa();
        ml.nim = "023432";
        ml.nama = "Yansy Ayuningtyas";
        ml.alamat = "Nias, Sumatera Utara";
        ml.kelas = "2A";
        ml.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "012343";
        m2.nama = "Dessy";
        m2.alamat = "Blitar";
        m2.kelas = "2E";
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "123443";
        m3.nama = "Ahmad";
        m3.kelas = "2A";
        m3.alamat = "Pakistan";
        m3.displayBiodata();
    }
}
