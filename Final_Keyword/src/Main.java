/*
* in this program i am going to take input from the user and calculate are of the circle*
* */

import javax.swing.JOptionPane;

public class Main {
    static final double PI  = 3.14159;
    public static void main(String[] args) {

        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
        double result  = areaOfTheCircle(x);
        System.out.println("Area of the circle : "+ result);
        JOptionPane.showMessageDialog(null,"Area of the circle is : "+ result);

    }
    static double areaOfTheCircle(double r){
        return PI*r*r;
    }
}