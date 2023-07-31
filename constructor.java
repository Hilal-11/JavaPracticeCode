// class test {
//     String name;
//     String addrses;
//     String age;
//     String qualification;

//     test() {
//         name = "Hilal Ahmad Ganie";
//         addrses = "Lolab";
//         age = "18 years";
//         qualification = "BCA";

//     }

//     void shown() {
//         test data_1 = new test();
//         System.out.println("Name : " + data_1.name);
//         System.out.println("Address : " + data_1.addrses);
//         System.out.println("Age : " + data_1.age);
//         System.out.println("Qualification : " + data_1.qualification);
//     }

// }

// public class constructor {
//     public static void main(String[] args) {
//         test data_1 = new test();
//         System.out.println("Name : " + data_1.name);
//         System.out.println("Address : " + data_1.addrses);
//         System.out.println("Age : " + data_1.age);
//         System.out.println("Qualification : " + data_1.qualification);

//         System.out.println("\n");

//         test data_2 = new test();
//         data_2.shown();

//     }
// }

// class box {
//     double width;
//     double height;
//     double depth;

//     box() {
//         width = 10;
//         height = 10;
//         depth = 10;
//     }

//     double volum() {
//         return width * height * depth;
//     }

// }

// public class constructor {
//     public static void main(String[] args) {

//         box box_1 = new box();
//         System.err.println("Volum of Box 1 = " + box_1.volum());
//         box box_2 = new box();
//         System.err.println("Volum of Box 2 = " + box_2.volum());
//         box box_3 = new box();
//         System.err.println("Volum of Box 3 = " + box_3.volum());

//     }
// }

// class box {
//     double width;
//     double height;
//     double depth;

//     box(double w, double h, double d) {
//         this.width = w;
//         this.height = h;
//         this.depth = d;

//     }

//     double volum() {
//         return width * height * depth;
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         box box_1 = new box(10, 10, 10);
//         System.out.println("width : " + box_1.width);
//         System.out.println("height : " + box_1.height);
//         System.out.println("depth : " + box_1.depth);

//         System.out.println(" \n ");
//         System.out.println("Total Volum of box 1 = " + box_1.volum());

//         box box_2 = new box(30, 20, 18);
//         System.out.println("width : " + box_2.width);
//         System.out.println("height : " + box_2.height);
//         System.out.println("depth : " + box_2.depth);

//         System.out.println(" \n ");
//         System.out.println("Total Volum of box 2 = " + box_2.volum());
//     }
// }

// copy conatructor
// copy conatructor

// class employee {
//     int id;
//     String name;
//     String address;

//     employee(int i, String n, String a) {
//         id = i;
//         name = n;
//         address = a;

//         System.out.println("Original :" + id);
//         System.out.println("Original :" + name);
//         System.out.println("Original :" + address);
//     }

//     public employee(employee emp) {

//         System.err.println("Copy :" + emp.id);
//         System.err.println("Copy :" + emp.name);
//         System.err.println("Copy :" + emp.address);
//     }
// }

// public class constructor {
//     public static void main(String[] args) {

//         employee emp_1 = new employee(1933, "Hilal", "Lolab Kalaroos");
//         System.out.println("\n");
//         employee emp2 = new employee(emp_1);

//         System.out.println("\n");

//         employee emp_3 = new employee(1934, "Waseem", "Lolab Kalaroos");
//         System.out.println("\n");                             
//         employee emp3 = new employee(emp_3);
//     }
// }

class box {
    double width;
    double height;
    double depth;

    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

        System.out.println("Original :" + width);
        System.out.println("Original :" + height);
        System.out.println("Original :" + depth);

        System.out.println("\n Volum = " + width * height * depth);
    }

    public box(box boxx) {

        System.err.println("Copy :" + boxx.width);
        System.err.println("Copy :" + boxx.height);
        System.err.println("Copy :" + boxx.depth);

        System.err.println("Copy Volum = " + boxx.width * boxx.height * boxx.depth);

    }
}

public class constructor {
    public static void main(String[] args) {

        box box_1 = new box(10, 10, 10);
        box box_2 = new box(box_1);

        box box_3 = new box(12, 16, 8);
        box box_4 = new box(box_3);
    }
}