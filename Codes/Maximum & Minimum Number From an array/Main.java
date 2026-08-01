// Find the maximum & minimum number in an array of integers. 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= sc.nextInt();
        int[] myarray = new int[size];
        
        System.out.println("Enter: "+size+" of elements: ");
        for(int i=0;i<size;i++){
            myarray[i]=sc.nextInt();
        }
        
        System.out.println("The Elements of an Array are: ");
        for(int i=0;i<size;i++){
            System.out.println(myarray[i]);
        }
        
        int maxno = myarray[0];
        int minno = myarray[0];
        
        System.out.println("Maximum and minimum elements of array are: ");
        for(int i=0;i<myarray.length;i++){
            if(myarray[i]>maxno){
                maxno = myarray[i];
            }
            if(myarray[i]<minno){
                minno=myarray[i];
            }
        }
        
        System.out.println("The maximum number from array is: "+maxno);
        System.out.println("The minimum number from array is: "+minno);
        
    }
}
