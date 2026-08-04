// Calculator
import java.util.*;
class Main{
    static void calculator(int choice){
        Scanner sc  = new Scanner(System.in);
        int a,b;
        switch(choice){
            case 1:
                System.out.println("Enter any two number:");
                a= sc.nextInt();
                b= sc.nextInt();
                System.out.println("Addition is: "+(a+b));
            break;
            case 2:
                System.out.println("Enter any two number:");
                a= sc.nextInt();
                b= sc.nextInt();
                System.out.println("Subtraction is: "+(a-b));
            break;
            case 3:
                System.out.println("Enter any two number:");
                a= sc.nextInt();
                b= sc.nextInt();
                System.out.println("Multiplication is: "+(a*b));
            break;
            case 4:
                System.out.println("Enter any two number:");
                a= sc.nextInt();
                b= sc.nextInt();
                System.out.println("Division is: "+(a/b));
            break;
            case 5:
                System.out.println("Enter any two number:");
                a= sc.nextInt();
                b= sc.nextInt();
                System.out.println("Modulo is: "+(a%b));
            break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select any operation: ");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
        int ch = sc.nextInt();
        calculator(ch);
    }
}
