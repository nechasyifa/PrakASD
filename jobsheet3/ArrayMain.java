import java.util.Scanner;
public class ArrayMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kerucut[] kerucutArray = new Kerucut[3];
        LimasSegiEmpat[] limasArray = new LimasSegiEmpat[3];
        Bola[] bolaArray = new Bola[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan atribut untuk Kerucut ke: " + (i + 1));
            System.out.print("Jari-jari: ");
            double jariJariKerucut = input.nextDouble();
            System.out.print("Sisi miring: ");
            double sisiMiringKerucut = input.nextDouble();
            kerucutArray[i] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan atribut untuk Limas Segi Empat ke: " + (i + 1));
            System.out.print("Panjang sisi alas: ");
            double panjangSisiAlas = input.nextDouble();
            System.out.print("Tinggi limas: ");
            double tinggiLimas = input.nextDouble();
            limasArray[i] = new LimasSegiEmpat(panjangSisiAlas, tinggiLimas);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan atribut untuk Bola ke: " + (i + 1));
            System.out.print("Jari-jari: ");
            double jariJariBola = input.nextDouble();
            bolaArray[i] = new Bola(jariJariBola);
        }

        System.out.println("\nHasil");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nKerucut ke: " + (i + 1));
            System.out.println("Luas Permukaan: " + kerucutArray[i].hitungLuasPermukaan());
            System.out.println("Volume: " + kerucutArray[i].hitungVolume());

            System.out.println("\nLimas Segi Empat ke: " + (i + 1));
            System.out.println("Luas Permukaan: " + limasArray[i].hitungLuasPermukaan());
            System.out.println("Volume: " + limasArray[i].hitungVolume());

            System.out.println("\nBola ke: " + (i + 1));
            System.out.println("Luas Permukaan: " + bolaArray[i].hitungLuasPermukaan());
            System.out.println("Volume: " + bolaArray[i].hitungVolume());
        }
    }  
}