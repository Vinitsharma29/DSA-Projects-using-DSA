// Write a program to toggle a bit a position = “pos” in a number “n”.
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();
        
        System.out.println("Enter a position: ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        
        int newNo = no ^ bitmask;
        System.out.println(newNo);
    }
}
