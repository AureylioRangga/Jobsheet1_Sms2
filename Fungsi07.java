public class Fungsi07 {

    // Array 2 dimensi untuk menyimpan stok bunga setiap cabang
    static int[][] stok = {
        {10, 5, 15, 7},    // RoyalGarden 1
        {6, 11, 9, 12},    // RoyalGarden 2
        {2, 10, 10, 5},    // RoyalGarden 3
        {5, 7, 12, 9}      // RoyalGarden 4
    };  

    // Array harga bunga sesuai urutan jenis bunga
    static int[] harga = {75000, 50000, 60000, 10000};
   
    static int hitungPendapatan(int cabang) {
        int total = 0;  
        // Perulangan untuk menghitung pendapatan tiap jenis bunga
        for (int i = 0; i < 4; i++) {
            total += stok[cabang][i] * harga[i];  // Stok  bunga dikali harga bunga
        }
        return total;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int pendapatan = hitungPendapatan(i); 
            String status = (pendapatan > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan = Rp" + pendapatan);
            System.out.println("Status = " + status);
            System.out.println("----------------------");
        }
    }
}
