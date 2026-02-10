public class Array07 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Array Nama Mata Kuliah
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"};
        
        // Array bobot SKS masing' mata kuliah
        int[] bobotSKS = {2, 2, 2, 3, 2, 3, 1, 2};

        double[] nilaiAngka = new double[namaMK.length]; // Array untuk menyimpan nilai angka
        String[] nilaiHuruf = new String[namaMK.length]; // Array untuk menyimpan nilai huruf
        double[] nilaiSetara = new double[namaMK.length];  // Array untuk menyimpan nilai setara

        // Tampilan Judul Program
        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        // Perulangan untuk input nilai setiap mata kuliah
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();

            // Konversi nilai angka ke nilai huruf dan nilai setara
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                // jika nilai kurang dari atau sama dengan 39
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }
        
        // Menampilkan hasil konversi nilai
        System.out.println("====================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s %-15s %-15s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalPoin = 0; // Total nilai (nilai setara x SKS)
        double totalSKS = 0;  // Total SKS

        // Perulangan untuk menampilkan data dan menghitung IP
        for (int i = 0; i < namaMK.length; i++) {

            // Menampilkan data setiap mata kuliah
            System.out.printf("%-40s %-15.2f %-15s %-10.2f\n", 
                namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);

            // Menghitung total poin
            totalPoin += (nilaiSetara[i] * bobotSKS[i]);
            // Menghtung total SKS
            totalSKS += bobotSKS[i];
        }
        // Menghitung IP Semester
        double ipSemester = totalPoin / totalSKS;

        // Menampilkan IP Semester
        System.out.println("=====================");
        System.out.printf("IP : %.2f\n", ipSemester);
        System.out.println("=====================");
        
        scanner.close();
    }
}