import java.util.Scanner;

public class perfect {
    public static boolean perfectNumber(int n) {
        boolean check = false;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();
        if (perfectNumber(n)) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }
    }
}
