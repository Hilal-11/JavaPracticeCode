import java.util.Scanner;

public class Febonacii {
    public static void Febonacii(int n) {

        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i <= n; i++) {
            System.out.print("    " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Range of n :- ");
        int n = input.nextInt();
        Febonacii(n);
    }
}
