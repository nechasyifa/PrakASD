import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int arrayLength = sc.nextInt();
        
        PersegiPanjang[] ppArray = new PersegiPanjang[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar " + ppArray[i].lebar);
        }
    }
}
