public class Main {
    public static void main(String[] args) {

        //create car object
        Car car1 = new Car("Tesla");

        //pass car object into the CarSale object
        CarSale carSale1 = new CarSale(car1);
    }
}