import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] studentsNames = {"Shehaan", "Sammy", "John", "lowxly"};

        for(String x : studentsNames){
            System.out.println(x);
        }

        System.out.println("\n");
        // for each loop may use to iterate through the collections
        ArrayList<String> parentsNames = new ArrayList<>();

        parentsNames.add("Wicky");
        parentsNames.add("Johnathon");
        parentsNames.add("Grace");

        for(String y : parentsNames){
            System.out.println(y);
        }


    }
}