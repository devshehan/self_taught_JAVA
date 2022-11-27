public class Human {
    private String name;
    private int age;
    private boolean isMale;

    // count of human objects that created using this class, need to identify variable  STATIC  variable.
    // when we use static key word it "OWNS" to the class not to the object.
    public static int count;

    Human(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;

        count ++;
    }

    static void countOfHumans(){
        System.out.println(count + " humans created by Human Class");
    }
}
