import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=====================================================================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================================================================================");
        
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", 
        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] bobotSKS = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];

        int totalSKS = 0;
        double jumlahNilai = 0.0, ip;

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }

        for (int i = 0; i < 8; i++) {
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } else {
                System.out.println("Nilai Tidak Valid");
            }
        }

        for (int i = 0; i < bobotSKS.length; i++) {
            jumlahNilai += bobotNilai[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        ip = jumlahNilai / totalSKS;

        System.out.println("=====================================================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================================================================================");
        System.out.printf("%-40s %-15s %-15s %-10s \n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s %-15s %-15s %-10s \n", mk[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("=====================================================================================");
        System.out.printf("IP : %.2f\n", ip);
        System.out.println();

        input.close();
    }
}