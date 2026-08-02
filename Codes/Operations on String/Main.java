// Operations on Strings 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string: ");
        String name1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String name2 = sc.nextLine();
        
        System.out.println("String Concatination: ");
        String final_name = name1+" "+name2;
        System.out.println(final_name);
        System.out.println();
        
        System.out.println("Length");
        System.out.println("Length of "+name1+" is: "+name1.length());
        System.out.println();
        
        System.out.println("Using charAt()");
        System.out.println(name1.charAt(0));
        System.out.println("charAt using for loop");
        for(int i=0;i<final_name.length();i++){
            System.out.println(i+" = "+final_name.charAt(i));
        }
        System.out.println();
        
        System.out.println("Compare");
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal to each other. ");
        }
        else{
            System.out.println("Strings are not equal to each other. ");
        }
        System.out.println();
        
        System.out.println("Substring. ");
        System.out.println(final_name.substring(0,5));
    }
}
