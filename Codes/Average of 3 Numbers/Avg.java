// Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
class Avg{
    public static void Myfunction(float a,float b,float c){
        float avg=(a+b+c)/3;
        System.out.println("Avg of 3 number is : "+avg);
        return;
    }
    public static void main(String[]args){
        System.out.println("Enter any three numbers for its average: ");
        Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat();
        float b =sc.nextFloat();
        float c=sc.nextFloat();
        Myfunction(a,b,c);
    }
} 
