import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = input.next();

        int n = Integer.parseInt(nim.substring(nim.length()-2));

        if (n < 10) {
            n += 10;
        }
        
        System.out.println("======================");
        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        input.close();
    }
}