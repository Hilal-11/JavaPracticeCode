import java.util.Scanner;

public class Plandrome {
    public static void Plandrome(int n) {
        int check = n;
        int r = 0;
        int s = 0;
        for (int i = n; i > 0; i = i / 10) {
            r = i % 10;
            s = s * 10 + r;
        }
        if (n == s) {
            System.out.println(s + " is a Plandrome Number");
        } else {
            System.out.println(s + " is not a Plandrome Number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number :- ");
        int n = input.nextInt();
        Plandrome(n);

        System.out.print("Enter any Number :- ");
        int m = input.nextInt();
        Plandrome(m);
    }
}
