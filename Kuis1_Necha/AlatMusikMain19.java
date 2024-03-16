import java.util.Scanner;
import java.util.Arrays;

public class AlatMusikMain19 {
    public static void main(String[] args) {
        String[] namaAlatMusik = {"Gitar", "Bass", "Drum", "Keyboard", "Piano"};
        String[] merk = {"Yamaha", "Stereo", "Yamaha", "Bazo", "Yamaha"};
        String[] kategoriAlatMusik = {"Baru", "Baru", "Second", "Second", "Baru"};
        int[] stok = {2, 4, 3, 2, 1};
        int[] jumlahTerjual = {0, 0, 0, 0, 0};

        AlatMusik19[] daftarAlatMusik = new AlatMusik19[5];

        for (int i = 0; i < daftarAlatMusik.length; i++) {
            daftarAlatMusik[i] = new AlatMusik19(namaAlatMusik[i], merk[i], kategoriAlatMusik[i], stok[i], jumlahTerjual[i]);
        }

        System.out.println("Data Alat Musik:");
        for (AlatMusik19 alatMusik : daftarAlatMusik) {
            alatMusik.tampil();
        }

        System.out.println("Sisa Stok Alat Musik:");
        for (AlatMusik19 alatMusik : daftarAlatMusik) {
            System.out.println(alatMusik.nama + ": " + alatMusik.hitungSisa());
        }

        Arrays.sort(daftarAlatMusik, (a, b) -> a.nama.compareTo(b.nama));
        System.out.println("\nDaftar Alat Musik Ascending berdasarkan Nama:");
        for (AlatMusik19 alatMusik : daftarAlatMusik) {
            alatMusik.tampil();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data alat musik yang akan dibeli:");
        System.out.print("Nama Alat Musik: ");
        String namaBarang = scanner.next();
        System.out.print("Jumlah: ");
        int jumlahBeli = scanner.nextInt();
        scanner.nextLine();

        for (AlatMusik19 alatMusik : daftarAlatMusik) {
            if (alatMusik.nama.equalsIgnoreCase(namaBarang)) {
                if (jumlahBeli <= alatMusik.stok) {
                    alatMusik.stok -= jumlahBeli;
                    alatMusik.jumlahterjual += jumlahBeli;
                    System.out.println("Barang berhasil dibeli!");
                } else {
                    System.out.println("Stok tidak mencukupi untuk pembelian ini.");
                }
                break;
            }
        }

        AlatMusik19 alatMusikTerlaris = cariAlatMusikTerlaris(daftarAlatMusik);
        System.out.println("\nAlat Musik Terlaris:");
        alatMusikTerlaris.tampil();
        System.out.println("\nData Alat Musik setelah pembelian:");
        for (AlatMusik19 alatMusik : daftarAlatMusik) {
            alatMusik.tampil();
        }
    }

    public static AlatMusik19 cariAlatMusikTerlaris(AlatMusik19[] daftarAlatMusik) {
        AlatMusik19 terlaris = daftarAlatMusik[0];
        for (AlatMusik19 alatMusik : daftarAlatMusik) {
            if (alatMusik.jumlahterjual > terlaris.jumlahterjual) {
                terlaris = alatMusik;
            }
        }
        return terlaris;
    }
}
