public class TES {
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12}, 
            {2, 10, 10, 5}, 
            {5, 7, 12, 9}   
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        hitungPendapatanDanStatus(stokBunga, hargaBunga);
    }  
    
    static void hitungPendapatanDanStatus(int[][] stok, int[] harga) {
        System.out.println("-------------------------------------------------");
        System.out.println("REKAP PENDAPATAN CABANG ROYAL GARDEN");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += (stok[i][j] * harga[j]);
            }
            String status;
            if (totalPendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }
            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + totalPendapatan);
            System.out.println("Status     : " + status);
            System.out.println("-------------------------------------------------");
        }
    }
}