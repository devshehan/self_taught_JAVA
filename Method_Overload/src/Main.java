public class Main {
    public static void main(String[] args) {

        System.out.println(multiply(1,6,2));
    }

    static double multiply(int a, int b){
        System.out.println("#1 function is called");
        return a*b;
    }

    static double multiply(int a ,int b, int c){
        System.out.println("#2 function is called");
        return a*b*c;
    }

    static double multiply(int a , int b , int c , int d){
        System.out.println("#3 function is called");
        return a*b*c*d;
    }
}