import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        // // // // Method-1 // // // //
        // // // // Method-1 // // // //

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:- ");
        int n = input.nextInt();
        int row;
        for (row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("   ");
            }
            for (int str1 = 1; str1 <= row - 1; str1++) {
                System.out.print(" * ");

            }
            for (int str2 = 1; str2 <= row; str2++) {
                System.out.print(" * ");

            }

            System.out.println();
            System.out.println();

        }
        for (int spa = 1; spa <= row; spa++) {
            for (int spa2 = 1; spa2 <= spa; spa2++) {
                System.out.print("   ");
            }

            for (int str3 = 1; str3 <= n - spa - 1; str3++) {
                System.out.print(" * ");
            }
            for (int str4 = 1; str4 <= row - spa - 1; str4++) {
                System.out.print(" * ");
            }
            System.out.println();
            System.out.println();

        }

    }
}

// // // // Method-2 // // // //
// // // // Method-2 // // // //

// import java.util.Scanner;

// public class pattern {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.println("Enter n:- ");
// int n = input.nextInt();
// int row;
// for (row = 1; row <= n; row++) {
// for (int col = 1; col <= n - row; col++) {
// System.out.print(" ");
// }
// for (int str1 = 1; str1 <= row * 2 - 1; str1++) {
// System.out.print(" * ");

// }

// System.out.println();
// System.out.println();

// }
// for (int spa = 1; spa <= row; spa++) {
// for (int spa2 = 1; spa2 <= spa; spa2++) {
// System.out.print(" ");
// }

// for (int str3 = 1; str3 <= n - spa - 1; str3++) {
// System.out.print(" * ");
// }
// for (int str4 = 1; str4 <= row - spa - 1; str4++) {
// System.out.print(" * ");
// }
// System.out.println();
// System.out.println();

// }

// }
// }
