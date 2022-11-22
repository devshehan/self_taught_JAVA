public class Main {
    public static void main(String[] args) {

        // default constructor will be called.
        Human sam = new Human();
        System.out.println(sam.getName());


        Human john = new Human("John",22,true,"Manchester");
        System.out.println(john.getName());

    }
}