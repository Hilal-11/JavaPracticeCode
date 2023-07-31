import java.util.Scanner;

class practice {

    // public static int sum(int a, int b) {
    // System.out.print(a + " " + b);
    // return a + b;
    // }

    // public static int a() {
    // return 100;
    // }

    // public static int b() {
    // return a();
    // }

    public static void myFun(int temp) {
        temp *= 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 10;
        myFun(a);
        System.out.print(a);

        // System.out.println(5 > 4 ? "Hii" : "Hello");

        // System.out.println(sum(sum(10, 20), 30));

        // String str = null;
        // System.out.print("-" + str.trim() + "-");

        // int n = input.nextInt();
        // for (int row = 1; row <= n; row++) {
        // Triangle // for (int col = 1; col <= n - row; col++) {
        // star Pattern // System.out.print(" ");
        // }
        // for (int str = 1; str <= row; str++) {
        // System.out.print(" * ");

        // }
        // for (int str2 = 1; str2 <= row - 1; str2++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // System.out.println();

        // }

    }
}
