import java.util.Scanner;

public class TugasNo2 {
    static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah yang ingin diinput (n): ");
        int jumlahData = inputUser.nextInt();
        inputUser.nextLine();

        String[][] dataKuliah = new String[jumlahData][4];
        isiDataJadwal(dataKuliah);

        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihanMenu = inputUser.nextInt();
            inputUser.nextLine();

            switch (pilihanMenu) {
                case 1:
                    tampilSemua(dataKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan nama hari (Senin/Selasa/dll): ");
                    String hariCari = inputUser.nextLine();
                    tampilJadwalHari(dataKuliah, hariCari);
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String matkulCari = inputUser.nextLine();
                    tampilJadwalMatkul(dataKuliah, matkulCari);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void isiDataJadwal(String[][] jadwalKuliah) {
        System.out.println("\n--- Input Data Jadwal ---");
        for (int indeks = 0; indeks < jadwalKuliah.length; indeks++) {
            System.out.println("Data ke-" + (indeks + 1));

            System.out.print("Nama Mata Kuliah     : ");
            jadwalKuliah[indeks][0] = inputUser.nextLine();

            System.out.print("Ruang                : ");
            jadwalKuliah[indeks][1] = inputUser.nextLine();

            System.out.print("Hari                 : ");
            jadwalKuliah[indeks][2] = inputUser.nextLine();

            System.out.print("Jam (contoh: 08.00)  : ");
            jadwalKuliah[indeks][3] = inputUser.nextLine();
            System.out.println();
        }
    }

    static void tampilSemua(String[][] jadwalKuliah) {
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        for (int indeks = 0; indeks < jadwalKuliah.length; indeks++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwalKuliah[indeks][0], jadwalKuliah[indeks][1],
                    jadwalKuliah[indeks][2], jadwalKuliah[indeks][3]);
        }
    }

    static void tampilJadwalHari(String[][] jadwalKuliah, String hariTarget) {
        System.out.println("\n--- Jadwal Hari " + hariTarget + " ---");
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        boolean statusKetemu = false;
        for (int indeks = 0; indeks < jadwalKuliah.length; indeks++) {
            if (jadwalKuliah[indeks][2].equalsIgnoreCase(hariTarget)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n",
                        jadwalKuliah[indeks][0], jadwalKuliah[indeks][1],
                        jadwalKuliah[indeks][2], jadwalKuliah[indeks][3]);
                statusKetemu = true;
            }
        }

        if (!statusKetemu) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariTarget);
        }
    }

    static void tampilJadwalMatkul(String[][] jadwalKuliah, String matkulTarget) {
        System.out.println("\n------- Pencarian Mata Kuliah: " + matkulTarget + " -------");
        System.out.printf("%-25s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        boolean statusKetemu = false;
        for (int indeks = 0; indeks < jadwalKuliah.length; indeks++) {
            if (jadwalKuliah[indeks][0].equalsIgnoreCase(matkulTarget)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n",
                        jadwalKuliah[indeks][0], jadwalKuliah[indeks][1],
                        jadwalKuliah[indeks][2], jadwalKuliah[indeks][3]);
                statusKetemu = true;
            }
        }

        if (!statusKetemu) {
            System.out.println("Tidak ada mata kuliah bernama \"" + matkulTarget + "\"");
        }
    }
}