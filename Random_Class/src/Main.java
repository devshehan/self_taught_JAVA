//from java library util package get Random calss
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // create random object using random class
        Random random = new Random();

        // machines start from the zero there for should add +1
        int value = random.nextInt(6)+1;

        System.out.println(value);
    }
}