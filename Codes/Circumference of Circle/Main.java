//A function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
class Main{
    static void CircumferenceOfCircle(float r){
        final float pi = 3.14f;
        float circle = 2 * pi * r;
        System.out.println("circumference of circle is: "+circle);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the radius to calcullate the CircumferenceOfCircle: ");
        float r = sc.nextFloat();
        CircumferenceOfCircle(r);
    }
}
