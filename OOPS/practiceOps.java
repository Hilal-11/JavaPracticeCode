// package BasicsOfoops;

// class Friends {
//     String name;
//     String age;
//     String address;

//     void show() {
//         System.out.println("Name = " + name);
//         System.out.println("age = " + age);
//         System.out.println("address = " + address);

//     }
// }

// class Employee {
//     static int id = 7465;
//     static int age = 30;
//     static String name = "Hilal";
//     static int salary = 70000;

//     static void countSalary() {
//         System.out.println(salary * 2);
//     }
// }
import package2.myPackage;

class Employee {
    private int id = 7465;
    private int age = 30;
    String name = "Hilal";
    private int salary = 70000;
    int phone = 56613668;

    private void countSalary() {
        System.out.println(salary * 2);
    }

}

public class practiceOps {
    public static void main(String[] args) {

        Employee deve = new Employee();

        myPackage myClass = new myPackage();
        myClass.show();

        // Employee emp1 = new Employee();
        // System.out.println("Id : " + Employee.id);
        // System.out.println("Age : " + Employee.age);
        // System.out.println("Name : " + Employee.name);
        // System.out.println("Salary : " + Employee.salary);
        // Employee.countSalary();

        // Friends frnd_1 = new Friends();
        // frnd_1.name = "Hilal";
        // frnd_1.age = "18Years";
        // frnd_1.address = "Kalaroos";
        // System.out.println("\n");

        // System.out.println(frnd_1.name);
        // System.out.println(frnd_1.age);
        // System.out.println(frnd_1.address);

        // Friends frnd_2 = new Friends();
        // frnd_2.name = frnd_1.name;
        // frnd_2.age = frnd_1.age;
        // frnd_2.address = frnd_1.address;
        // System.out.println("\n");

        // System.out.println(frnd_2.name);
        // System.out.println(frnd_2.age);
        // System.out.println(frnd_2.address);

        // Friends frnd_3 = new Friends();
        // frnd_3.name = "Waseem";
        // frnd_3.age = "18years";
        // frnd_3.address = "Kalaroos";

        // System.out.println("\n");

        // System.out.println(frnd_3.name);
        // System.out.println(frnd_3.age);
        // System.out.println(frnd_3.address);

        // Friends frnd = new Friends();
        // frnd.name = "Hilal";
        // frnd.age = "18Years";
        // frnd.address = "Kalaroos";

        // frnd.show();

        // Friends frnd_2 = new Friends();
        // frnd_2.name = "Waseem";
        // frnd_2.age = "18years";
        // frnd_2.address = "Kalaroos";
        // frnd_2.show();

    }

}
