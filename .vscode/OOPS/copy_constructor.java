class Employee {
    int id;
    String name;
    String company;

    Employee(int Eid, String Name, String companyName) {
        id = Eid;
        name = Name;
        company = companyName;
        System.out.println("Original :" + id);
        System.out.println("Original :" + name);
        System.out.println("Original :" + company);
    }

    Employee(Employee emp) {
        System.out.println("copy Constructor : " + emp.id);
        System.out.println("copy Constructor : " + emp.name);
        System.out.println("copy Constructor : " + emp.company);
    }
}

public class copy_constructor {
    public static void main(String[] args) {

        Employee emp_1 = new Employee(84564, "Hilla Ahmad Gnaie", "Google");
        System.out.println();
        Employee emp_2 = new Employee(emp_1);

    }
}