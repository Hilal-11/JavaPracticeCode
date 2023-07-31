class A {
    String name;
    String address;
    String collage;
    int age;

    A() {
        name = "Hilal Ahmad Ganie";
        address = "Kupwara Kalaroos";
        collage = "GDC Kupwara";
        age = 17;

    }

    void show() {
        System.out.println("name : " + name);
        System.out.println("address : " + address);
        System.out.println("collage : " + collage);
        System.out.println("age : " + age);

    }

}

public class Default_cons {
    public static void main(String[] args) {

        A object = new A();
        object.show();

        System.out.println();
        System.out.println();

        A object_2 = new A();
        object_2.name = "Waseem";
        object_2.address = "Kalaroos";
        object_2.collage = "GDC Kupeara";
        object_2.age = 18;

        object_2.show();

    }

}
