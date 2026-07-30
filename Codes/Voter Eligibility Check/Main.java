//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
class Main{
    static void Vote(int age){
        if(age>18){
            System.out.println("You're Eligible to Vote beacuse your age is :"+age);
        }
        else{
            System.out.println("You're not Eligible to Vote beacuse your age is less then 18");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int a = sc.nextInt();
        Vote(a);
    }
}
