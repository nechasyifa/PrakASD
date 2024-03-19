/**
 * MainSum
 */
import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int Jmlperusahaan = sc.nextInt();

        Sum[] perusahaan = new Sum[Jmlperusahaan];

        for (int i = 0; i < Jmlperusahaan; i++) {
            System.out.println("============================================================");
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke- " + (i + 1) + ": ");
            int Jmlbulan = sc.nextInt();
            perusahaan[i] = new Sum(Jmlbulan);
            for (int j = 0; j < Jmlbulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke- " + (j + 1) + " untuk perusahaan ke- " + (i + 1) + ": ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }
        sc.close();

        System.out.println("============================================================");
        for (int i = 0; i < Jmlperusahaan; i++) {
            System.out.println("Perusahaan ke- " + (i + 1));
            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalBF(perusahaan[i].keuntungan));
            System.out.println("============================================================");
            System.out.println("Algoritma Devide and Conquer");
            double totalDC = perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen-1);
            System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " + String.format("%.2f", totalDC));
            System.out.println("============================================================");
        }
    }
}
