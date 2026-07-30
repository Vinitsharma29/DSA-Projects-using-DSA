// a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
class Main{
    public static void oddnumbersum(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The Sum of all odd numbers is: "+sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for printing sum of all odd numbers that exist between the number");
        int a = sc.nextInt();
        oddnumbersum(a);
    }
}
