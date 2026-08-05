// Write a program to find if a number is a power of 2 or not
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is a power of 2 or not: ");
        int number = sc.nextInt();
    
        if(number>0 && (number & number-1) == 0 ){
            System.out.println("Number is a power of 2");
        }
        else{
            System.out.println("Number is not a power of 2");
        }
    }
}
