// Implementing all the function of the StringBuilder class
import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.println("String builder class Example: ");
        StringBuilder sb = new StringBuilder("Vinit");
        System.out.println("Original String: "+sb);
        
        // Get charAt()
        System.out.println("Using charAt(): ");
        System.out.println(sb.charAt(0));
        System.out.println();
        System.out.println("Using charAt(): by forloop");
        for(int i=0;i<sb.length();i++){
            System.out.println(sb.charAt(i));
        }
        System.out.println();
        
        // Set charAt()
        System.out.println("Using setCharAt(): ");
        sb.setCharAt(0,'T');
        System.out.println(sb);
        System.out.println();
        
        // Insert
        System.out.println("Using insert(): ");
        sb.insert(2,'S');
        System.out.println(sb);
        System.out.println();
        
        // Delete
        System.out.println("Using delete(): ");
        sb.delete(2,3);
        System.out.println(sb);
        System.out.println();
        
        // Append a letter at the Append
        System.out.println("Using append(): ");
        sb.append("Sharma");
        System.out.println(sb);
        System.out.println();
        
        
        // Length of a StringBuilder
        System.out.println("Using length(): ");
        System.out.println(sb.length());
    }
}
