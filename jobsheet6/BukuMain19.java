
/**
 * BukuMain19
 */
import java.util.Scanner;

public class BukuMain19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku19 data = new PencarianBuku19();
        int jmlBuku = 5;

        System.out.println("_________________________________________________________");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("_________________________________________________________");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku19 m = new Buku19(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("_________________________________________________________");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("_________________________________________________________");
        System.out.println("_________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        System.out.println("Menggunakan Sequential Search : ");
        data.tampilData(cari, posisi);

        Buku19 dataBuku = data.FindBuku(cari);
        if (dataBuku != null) {
            dataBuku.tampilDataBuku();
        } else {
            System.out.println("Buku dengan kode " + cari + " tidak ditemukan");
        }

        System.out.println("=======================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jmlBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
