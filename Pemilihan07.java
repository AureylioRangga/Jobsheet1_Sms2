import java.util.Scanner;
public class Pemilihan07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.print("Masukkan nilai tugas: ");
    double tugas = sc.nextDouble();
    System.out.print("Masukkan nilai kuis: ");
    double kuis = sc.nextDouble();
    System.out.print("Masukkan nilai UTS: ");
    double uts = sc.nextDouble();
    System.out.print("Masukkan Nilai UAS: ");
    double uas = sc.nextDouble();

    if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 ||
        uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            String huruf;
            if (nilaiAkhir >= 80) huruf = "A";
            else if (nilaiAkhir >= 73) huruf = "B+";
            else if (nilaiAkhir >= 65) huruf = "B"; 
            else if (nilaiAkhir >= 60) huruf = "C+";
            else if (nilaiAkhir >= 50) huruf = "C";
            else if (nilaiAkhir >= 40) huruf = "D";
            else huruf = "E";
            
            String status = (huruf.equals("D") || huruf.equals("E") ? "TIDAK LULUS" : "SELAMAT ANDA LULUS");

            System.out.println("Nilai Akhir = " + nilaiAkhir);
            System.out.println("Nilai Huruf = " + huruf);
            System.out.println("Keterangan = " + status);
        }
    }
}