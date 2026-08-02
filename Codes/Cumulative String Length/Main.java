// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total size of an array: ");
        int size = sc.nextInt();
        
        sc.nextLine();
        
        String myarray[]=new String[size];
        int totallength=0;
        
        System.out.println("Enter "+size+" numbers of name");
        for(int i=0;i<size;i++){
            myarray[i]=sc.nextLine();
        }
        
        System.out.println("The names are: ");
        for(int i=0;i<size;i++){
            System.out.println(myarray[i]);
            totallength+=myarray[i].length();
        }
        
        System.out.println("totallength of mystring is: "+totallength);
    }
}
