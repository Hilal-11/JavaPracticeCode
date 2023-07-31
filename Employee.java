class Employee {
    private int id = 36363;
    private int age = 30;
    private int salary = 50000;
    private String name = "Hilal Ahmad Ganie";
    private String address = "Kalaroos";
    private int pincode = 193222;
    private String company = "Google";
    private int no = 7783733;

    Employee() {
        no = 7447474;
        name = "Fiddha";
    }

    Employee(String empName, int phoneNo) {

        no = phoneNo;
        name = empName;

    }

    private void HikeSalary() {
        System.out.println(salary * 2);
    }

    // Setter Method (changable)
    // Getter Method (non-changable)

    int getPhone() {
        return no;
    }

    String getName() {
        return name;
    }

    void setPhone(int phone) {
        no = phone;
    }

    void setName(String name) {
        this.name = name;

    }

}
