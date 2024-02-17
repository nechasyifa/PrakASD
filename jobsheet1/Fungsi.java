public class Fungsi {
    static int[][] stokBunga = {
            { 1, 10, 5, 15, 7 },
            { 2, 6, 11, 9, 12 },
            { 3, 2, 10, 10, 5 },
            { 4, 5, 7, 12, 9 }
    };

    static int[] hargaBunga = { 75000, 50000, 60000, 10000 };
    static String[] cabangToko = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4" };
    static String[] namaBunga = { "Algonema", "Keladi", "Alocasia", "Mawar" };

    public static void tampilPendapatan() {
        System.out.println("=============================================================");
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Habis Terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 1; j < stokBunga[i].length; j++) {
                pendapatanCabang += stokBunga[i][j] * hargaBunga[j-1];
        }
        System.out.println(cabangToko[i] + ": " + "RP " + pendapatanCabang);
    }
    System.out.println("=============================================================");
}

    public static void tampilStokCabang4() {
        System.out.println("Jumlah Stok Setiap Jenis Bunga pada Cabang RoyalGarden 4:");
        int[] stokCabang4 = stokBunga[3];

        for (int i = 1; i < stokCabang4.length; i++) {
            System.out.println(("Jumlah " + namaBunga[i - 1] + ": " + stokCabang4[i]));
        }

        System.out.println("=============================================================");
        System.out.println("Jumlah Stok Bunga Setelah Dikurangi:");
        stokCabang4[1] -= 1;
        stokCabang4[2] -= 2;
        stokCabang4[3] -= 0;
        stokCabang4[4] -= 5;

        for (int i = 1; i < stokCabang4.length; i++) {
            System.out.println(namaBunga[i - 1] + ": " + stokCabang4[i]);
        }
    }

    public static void main(String[] args) {
        tampilPendapatan();
        tampilStokCabang4();
    }
}