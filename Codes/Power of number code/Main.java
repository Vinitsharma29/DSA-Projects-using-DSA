// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
import java.util.*;
class Main{
    static void power(int x,int y){
        int result=1;
        for(int i=0;i<y;i++){
            result*=x;
        }
        System.out.println("x^n= "+result);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two value such that first value will be raised to power of another value: ");
        int x=sc.nextInt();
        int n=sc.nextInt();
        power(x,n);
    }
}
