import java.util.Scanner;

public class ASCII {

    public static void ASCII(int n) {
        for (int i = n; i <= 90; i++) {
            System.out.printf("%c \t", i);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n:- ");
        int n = input.nextInt();

        ASCII(n);

    }
}
