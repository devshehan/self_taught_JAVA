public class Car {
    private String name;
    private String color;
    private int wheels;
    private boolean isBooster;

    Car(String name, String color, int wheels, boolean isBooster){
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.isBooster = isBooster;

        System.out.println("Car class constructor created");
    }


    public String toString(){
        String myString = "Car class is called.\nCar name: "+this.name+"\nColor name: "+ this.color + "\nWheels : "+ this.wheels + "\nIs Booster: "+ this.isBooster;
        return myString;
    }
}
