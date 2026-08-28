// Without user input
// class Sum{
//     public static void sumofnnumbers(int i,int n,int sum){
//        if(i==n){
//         sum+=i;
//         System.out.println(sum);
//         return;
//        }
//         sum+=i;
//         sumofnnumbers(i+1, n, sum);
//         System.out.println(i);
//     }
//     public static void main(String args[]){
//         sumofnnumbers(1,5,0);
//     }
// }


// With user input
import java.util.*;
class Sum{
    public static void sumofnnumbers(int i,int n,int sum){
        if(i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumofnnumbers( i+1 , n,sum);
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number a initial number: ");
        int i = sc.nextInt();
        System.out.println("Enter a to print it sum of all numbers:");
        int n = sc.nextInt();
        sumofnnumbers(i,n,0);
    }
}
