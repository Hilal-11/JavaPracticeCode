class student {
    String name;
    String age;
    String collage;
    String qualification;
    String address;

    void print() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Collage : " + collage);
        System.out.println("Qualification : " + qualification);
        System.out.println("Address : " + address);

    }

}

public class oops_practice {
    public static void main(String[] args) {

        student std_1 = new student();
        std_1.name = "Hilal";
        std_1.age = "17 years";
        std_1.collage = "GDC_Kupwara";
        std_1.qualification = "BCA";
        std_1.address = "Kalaroos";

        System.out.println("Name : " + std_1.name);
        System.out.println("Age : " + std_1.age);
        System.out.println("Collage : " + std_1.collage);
        System.out.println("Qualification : " + std_1.qualification);
        System.out.println("Address : " + std_1.address);

        System.out.println();
        System.out.println();

        student std_2 = new student();
        std_2.name = "Fiddha";
        std_2.age = "15 years";
        std_2.collage = "GDC_Kupwara";
        std_2.qualification = "Bsc";
        std_2.address = "Kralpoora";

        System.out.println("Name : " + std_2.name);
        System.out.println("Age : " + std_2.age);
        System.out.println("Collage : " + std_2.collage);
        System.out.println("Qualification : " + std_2.qualification);
        System.out.println("Address : " + std_2.address);

        System.out.println();
        System.out.println();

        student std_3 = new student();
        std_3.name = "Aadil";
        std_3.age = "19 years";
        std_3.collage = "Kashmir University";
        std_3.qualification = "B.Tech";
        std_3.address = "Kupwara Lolab";

        System.out.println("Name : " + std_3.name);
        System.out.println("Age : " + std_3.age);
        System.out.println("Collage : " + std_3.collage);
        System.out.println("Qualification : " + std_3.qualification);
        System.out.println("Address : " + std_3.address);

        System.out.println();
        System.out.println();

        // Calling Using Method Classes
        // Calling Using Method Classes
        // Calling Using Method Classes

        student std_4 = new student();
        std_4.name = "Azhar Pir";
        std_4.age = "19 years";
        std_4.collage = "Kashmir University";
        std_4.qualification = "B.Tech";
        std_4.address = "Kupwara Kalaroos";

        std_4.print();

        System.out.println();
        System.out.println();

        student std_5 = new student();
        std_5.name = "Ishfaq Mir";
        std_5.age = "18 years";
        std_5.collage = "Jummu University";
        std_5.qualification = "BSC";
        std_5.address = "Kupwara Lolab";

        std_5.print();

        System.out.println();
        System.out.println();

        student std_6 = new student();
        std_6.name = "Tahair Ganie";
        std_6.age = "18 years";
        std_6.collage = "Jummu University";
        std_6.qualification = "B.Tech";
        std_6.address = "Kupwara Kralpoors";

        std_6.print();

    }
}
