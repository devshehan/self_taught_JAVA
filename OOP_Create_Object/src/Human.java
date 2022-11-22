public class Human {

    //initialized attributes/fields
    private String name;
    private int age;
    private boolean isMale;
    private String city;

    //create a constructor
    Human(){
        System.out.println("default constructor is called.");
    }

    Human(String name, int age, boolean isMale, String city){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public String getCity() {
        return city;
    }

    String getName(){
        return this.name;
    }



}
