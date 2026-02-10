import java.util.Scanner;

public class MenghitungNilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            String nilaiHuruf;
            if (nilaiAkhir >= 80) nilaiHuruf = "A";
            else if (nilaiAkhir >= 73) nilaiHuruf = "B+";
            else if (nilaiAkhir >= 65) nilaiHuruf = "B";
            else if (nilaiAkhir >= 60) nilaiHuruf = "C+";
            else if (nilaiAkhir >= 50) nilaiHuruf = "C";
            else if (nilaiAkhir >= 40) nilaiHuruf = "D";
            else nilaiHuruf = "E";

            String status = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E"))
                    ? "TIDAK LULUS" : "SELAMAT ANDA LULUS";

            System.out.println("Nilai Akhir = " + nilaiAkhir);
            System.out.println("Nilai Huruf = " + nilaiHuruf);
            System.out.println("Keterangan = " + status);
        }
    }
}
