import java.util.Scanner;

public class QueueMain3 {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Tambah pembeli");
        System.out.println("2. Hapus pembeli");
        System.out.println("3. Cek pembeli terdepan");
        System.out.println("4. Cek pembeli terbelakang");
        System.out.println("5. Cek posisi pembeli");
        System.out.println("6. Daftar semua pembeli");
        System.out.println("7. Keluar");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        Queue2 antrian = new Queue2(kapasitas);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    int noHP = sc.nextInt();
                    Pembeli pembeliBaru = new Pembeli(nama, noHP);
                    antrian.enqueue(pembeliBaru);
                    break;
                case 2:
                    Pembeli pembeliKeluar = antrian.dequeue();
                    if (pembeliKeluar != null) {
                        System.out.println("Pembeli yang keluar: " + pembeliKeluar.nama);
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Nama pembeli: ");
                    String namaCari = sc.nextLine();
                    antrian.peekPosition(namaCari);
                    break;
                case 6:
                    antrian.daftarPembeli();
                    break;
                case 7:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 7);
        sc.close();
    }
}