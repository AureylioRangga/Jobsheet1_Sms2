import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KODE PLAT KENDARAAN ===");

        char[] kode = {'A','B','D','E','F','T','Z','G','H','K'};  
        
        String[] kota = {"Banten","Jakarta","Bandung","Cirebon","Bogor","Tegal","Garut",
                         "Pekalongan","Semarang","Kendal"};

        System.out.print("Masukkan kode plat: ");
        char cari = input.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == cari) {
                System.out.println("Kota Plat " + cari + " adalah: " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}
