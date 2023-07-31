// package BasicOfoops;
public class practiceCons {
    int id;
    String name;
    String address;

    // void print() {

    // System.out.println("Id : " + id);
    // System.out.println("Name : " + name);
    // System.out.println("Address : " + address);

    // }

    void practiceCons() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);

    }

    public static void main(String[] args) {

        practiceCons data_1 = new practiceCons();
        data_1.id = 1374834;
        data_1.name = "Hilal Ahmad Ganie";
        data_1.address = "Kalaroos";

        data_1.practiceCons();
        // data_1.print();

        System.out.println();
        System.out.println();

        practiceCons data_2 = new practiceCons();
        data_2.id = 137487434;
        data_2.name = "Waseem Ahmad Ganie";
        data_2.address = "Kalaroos";

        data_2.practiceCons();

        System.out.println();
        System.out.println();

    }

}
