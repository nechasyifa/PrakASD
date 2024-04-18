
/**
 * PostfixMain19
 */
import java.util.Scanner;

public class PostfixMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix19 post = new Postfix19(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
