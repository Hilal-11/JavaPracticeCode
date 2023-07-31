class featurs {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    // Method OverLoading
    void add(double a, Double b) {
        System.out.println(a + b);
    }

    void add(String a, String b) {
        System.out.println(a + b);
    }
}

public class calculator {
    public static void main(String[] args) {

        featurs addition = new featurs();
        addition.add(10, 20);

        System.out.println();
        featurs addition2 = new featurs();
        addition2.add(10.55, 20.78);

        System.err.println();
        featurs str = new featurs();
        str.add("Hello", " World");

    }
}
