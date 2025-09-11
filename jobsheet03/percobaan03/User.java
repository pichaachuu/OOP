package jobsheet03.percobaan03;

public class User {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    private User(String username, String nama, String email){
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public static User createUser(String username, String nama, String email){
        return new User(username, nama, email);
    }

    public void cetakInfo(){
        System.out.println("Username: " + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("=======================");
    }
}
