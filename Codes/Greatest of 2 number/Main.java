// A function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
class Main{
    static void greatest(int a,int b){
        if(a>b){
            System.out.println("A is greater");
        }
        else if(a==b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("B is greater");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatest(a,b);
    }
}
