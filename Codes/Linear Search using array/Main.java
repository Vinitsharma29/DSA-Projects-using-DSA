// Take an array as input from the user.
// Search for a given number x and print the index at which it occurs
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array: "); // input for Array size
        int size= sc.nextInt();
        
        int[] myarray=new int[size];
        System.out.println("Enter the "+size+" numbers of elements: ");
        
        for(int i=0;i<size;i++){                         //Entering the elements of array
            myarray[i]=sc.nextInt();
        }
        
        System.out.println("The Array is: "); //Printing array
        for(int i=0;i<size;i++){
            System.out.println(myarray[i]);
        }
        
        System.out.println("Enter the elements to be search in array: ");
        int x=sc.nextInt();
        
        for(int i=0;i<myarray.length;i++){ //Search specific number in array
            if(myarray[i] == x){
                System.out.println("Element "+x+" found in array at location: "+i);
            }
        }
    }
}

// Same code using Function
import java.util.*;
class Main{
    static void Myfunction(int size){
        Scanner sc = new Scanner(System.in);
        int[] myarray=new int[size];
        System.out.println("Enter "+size+" numbers of elements: ");
        for(int i=0;i<size;i++){
            myarray[i]=sc.nextInt();
        }
        System.out.println("The elements in array are: ");
        for(int i=0;i<size;i++){
            System.out.println(myarray[i]);
        }
        
        System.out.println("Enter the element to be search: ");
        int number= sc.nextInt();
        for(int i=0;i<myarray.length;i++){
            if(myarray[i]==number){
                System.out.println("Element "+number+" found at location: "+i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        Myfunction(size);
    }
}
