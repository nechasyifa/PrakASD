import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {

        double tugas, kuis, uts, uas, totalNilai= 0;
        String nilaiHuruf = " ", status = " ";
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
            System.exit(0);
        } else {
            totalNilai = (tugas * 0.2 + kuis * 0.2 + uts * 0.3 + uas * 0.3);
        }
        if (totalNilai > 80 && totalNilai <= 100) {
            nilaiHuruf = "A";
        } else if (totalNilai > 73 && totalNilai <= 80) {
            nilaiHuruf = "B+";
        } else if (totalNilai > 65 && totalNilai <= 73) {
            nilaiHuruf = "B";
        } else if (totalNilai > 60 && totalNilai <= 65) {
            nilaiHuruf = "C+";
        } else if (totalNilai > 50 && totalNilai <= 60) {
            nilaiHuruf = "C";
        } else if (totalNilai > 39 && totalNilai <= 50) {
            nilaiHuruf = "D";
        } else if (totalNilai <= 39) {
            nilaiHuruf = "E";
        } else  {
            System.out.println("Nilai Tidak Valid");
        }

        if (nilaiHuruf.equalsIgnoreCase("D") || nilaiHuruf.equalsIgnoreCase("E")) {
            status = "MAAF ANDA TIDAK LULUS";
        } else {
            status = "SELAMAT ANDA LULUS";
        }

        System.out.println("Nilai Akhir: " + totalNilai);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(status);

        input.close();
    }
}
