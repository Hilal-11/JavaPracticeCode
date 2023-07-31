import java.util.Scanner;

public class perfectNum {

    public static int perfectNum(int n) {
        int check = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            check = 1;
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr value of n :- ");
        int n = input.nextInt();

        if (perfectNum(n) == 1) {
            System.out.println(n + " is a perfect Number.");
        } else {
            System.out.println(n + " is not a perfect Number.");
        }
    }

}
