class test {

    private test() {
        System.out.println("Private Conatructor is Called...");
        test obj = new test();

    }

}

public class privateDemo {

    private privateDemo() {
        System.out.println("Private Conatructor is Called...");

    }

    public static void main(String[] args) {
        privateDemo obj = new privateDemo();
        privateDemo objj = new privateDemo();

        // test obj = new test();

    }
}
