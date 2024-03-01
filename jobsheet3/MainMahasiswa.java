import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan nim: ");
            String nim = input.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();

            mahasiswaArray[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            mahasiswaArray[i].tampilInformasi();
        }

        double rataIpk = Mahasiswa.hitungRataIpk(mahasiswaArray);
        System.out.println("\nRata-rata IPK: " + rataIpk);
        Mahasiswa.tampilIpkTertinggi(mahasiswaArray);
    }
}