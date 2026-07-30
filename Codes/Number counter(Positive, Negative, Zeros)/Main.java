// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
class Main{
    static void Myfunction(int n){
        Scanner sc = new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zeros=0;
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++){
            int a =sc.nextInt();
            if(a>0){
                positive++;
            }
            else if(a<0){
                negative++;
            }
            else{
                zeros++;
            }
        }
        System.out.println("Total positive number are: "+positive);
        System.out.println("Total negative number are: "+negative);
        System.out.println("Total zeros are: "+zeros);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want? ");
        int a = sc.nextInt();
        Myfunction(a);
    }
}
