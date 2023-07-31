public class access {
    public static void main(String[] args) {
        child son_1 = new child();
        System.out.println(son_1.name);
        System.out.println(son_1.sirName);
        System.out.println(son_1.age);

        System.out.println();

        father fath1 = new father();
        System.out.println(fath1.name);
        System.err.println(fath1.sirName);
        System.err.println(fath1.age);

    }
}
