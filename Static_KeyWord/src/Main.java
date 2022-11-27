public class Main {
    public static void main(String[] args) {

        //create a man using HUMAN class
        Human h1 = new Human("Josse",22,true);
        Human h2 = new Human("Sandy",35,false);
        Human h3 = new Human("Messi",31,true);

        //without creating object using human class we able to access static variables or method or anything
        //because of when we identify static keyword that OWNS to the class and not depend on object

        Human.countOfHumans();
    }
}