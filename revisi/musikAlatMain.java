import java.util.Scanner;
import java.util.Arrays;

public class musikAlatMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        musikAlat[] daftarAlatMusik = new musikAlat[5];

        for (int i = 0; i < daftarAlatMusik.length; i++) {
            System.out.println("Masukkan data untuk Alat Musik ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Merk: ");
            String merk = scanner.next();
            System.out.print("Kategori: ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Jumlah Terjual: ");
            int jumlahTerjual = scanner.nextInt();

            daftarAlatMusik[i] = new musikAlat(nama, merk, kategori, stok, jumlahTerjual);
            System.out.println();
        }

        System.out.println("Data Alat Musik:");
        for (musikAlat alatMusik : daftarAlatMusik) {
            alatMusik.tampil();
        }

        System.out.println("Sisa Stok Alat Musik:");
        for (musikAlat alatMusik : daftarAlatMusik) {
            System.out.println(alatMusik.nama + ": " + alatMusik.hitungSisa());
        }

        musikAlat alatMusikTerlaris = cariAlatMusikTerlaris(daftarAlatMusik);
        System.out.println("\nAlat Musik Terlaris:");
        alatMusikTerlaris.tampil();

        Arrays.sort(daftarAlatMusik, (a, b) -> a.nama.compareTo(b.nama));
        System.out.println("Daftar Alat Musik (Ascending berdasarkan Nama):");
        for (musikAlat alatMusik : daftarAlatMusik) {
            alatMusik.tampil();
        }
    }

    public static musikAlat cariAlatMusikTerlaris(musikAlat[] daftarAlatMusik) {
        musikAlat terlaris = daftarAlatMusik[0];
        for (musikAlat alatMusik : daftarAlatMusik) {
            if (alatMusik.jumlahterjual > terlaris.jumlahterjual) {
                terlaris = alatMusik;
            }
        }
        return terlaris;
    }
}