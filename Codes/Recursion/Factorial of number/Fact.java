//  Without user input
// class Fact{
//     public static void factofnumber(int i,int n,int fact){
//         if( i==n ){
//             fact*=i;
//             System.out.println(fact);
//             return;
//         }
//         fact*=i;
//         factofnumber(i+1, n , fact);
//     }
//     public static void main(String[] args){
//         factofnumber(1,5,1);
//     }
// }

// With user input
import java.util.*;
class fact{
    public static void factofnumber(int i,int n,int fact){
        if(i == n){
            fact*=i;
            System.out.println(fact);
            return;
        }
        fact*=i;
        factofnumber(i+1,n,fact);
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number to calculate its factorial");
        int n = sc.nextInt();
        factofnumber(1,n,1);
    }
} 
