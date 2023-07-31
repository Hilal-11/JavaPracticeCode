import org.w3c.dom.Text;

class test1 {
    int num = 100;
}

public class Static {
    static int a = 10;

    public static void main(String[] args) {

        System.out.println(a);

        test1 test = new test1();
        System.out.println(test.num);

    }
}
