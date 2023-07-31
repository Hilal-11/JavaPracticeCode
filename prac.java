import java.util.Scanner;

public class prac {

    // public static void PrimeNumbers(int n) {
    // int t = 2;
    // int count = 0;
    // while (t <= n) {
    // boolean check = true;
    // for (int i = 2; i <= t - 1; i++) {
    // if (t % i == 0) {
    // check = false;
    // }
    // }
    // if (check) {
    // System.out.print(t + " ");
    // count++;
    // }
    // t++;
    // }
    // System.out.println("\n");
    // System.out.println(count);
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();
        int t = 2;
        int count = 0;

        while (t <= n) {
            boolean check = true;

            for (int i = 2; i <= t - 1; i++) {
                if (t % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(t + "  ");
                count++;
            }

            t++;
        }
        System.out.println("\n");
        System.out.print(count);

    }
}
