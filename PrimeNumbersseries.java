import java.util.Scanner;

public class PrimeNumbersseries {

    public static void PrimeNumbers(int low, int high) {

        while (low <= high) {
            boolean check = true;
            for (int i = 2; i <= low - 1; i++) {

                if (low % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(low + "  ");
            }
            low++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int low = 2;
        int high = 9000;
        PrimeNumbers(low, high);

    }
}
