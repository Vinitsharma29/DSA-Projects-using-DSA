// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.*;
class Main{
    static void Fibonacci(int a){
        System.out.println("Fibonacci series for "+a);
        int fibo=0;
        for(int i=0;i<=a;i++){
            fibo+=i;
        }
        System.out.println(fibo);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Fibonacci series of it: ");
        int no = sc.nextInt();
        Fibonacci(no);
    }
}
