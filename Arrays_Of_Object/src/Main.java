public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari");
        Car car2 = new Car("Lamborghini");
        Car car3 = new Car("Bugatti");

        //create arrays of car objects

        Car[] carSale  = new Car[3];

        carSale[0] = car1;
        carSale[1] = car2;
        carSale[2] = car3;

        // print the all element of the array using for each loop
        for(Car x : carSale){
            System.out.println(x.name);
        }



    }
}