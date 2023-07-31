import java.util.jar.Attributes.Name;

class test {

    // test() {

    // }

    test(String name, String address) {
        System.out.println("Parametre Constructor Name :" + name);
        System.out.println("Parametre Constructor address :" + address);

    }

}

public class Parameterised_cons {
    public static void main(String[] args) {

        test object = new test("Hilal Ahmad Ganie.", "Kalaroos Lolab");

    }

}
