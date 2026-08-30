package Array;
import java.util.*;
class SecondLargestSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the "+size+" numbers of elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        int maxvalue = arr[0];
        int minvalue = arr[0];


        for(int i=0;i<arr.length;i++){
            if(arr[i] < minvalue){
                minvalue = arr[i];
            }
            if(arr[i]> maxvalue){
                maxvalue = arr[i];
            }
        }

        System.out.println("Maximum Value is: "+maxvalue);
        System.out.println("Minimum Value is: "+minvalue);
        
        int secmax = Integer.MIN_VALUE;
        int secmin = Integer.MAX_VALUE;
        // Finding Second Greatest & Smallest Element
        for(int i=0;i<arr.length;i++){
            if(arr[i] <secmin && arr[i] > minvalue){
                secmin = arr[i];
            }
            if(arr[i] > secmax&& arr[i] < maxvalue){
                secmax = arr[i];    
            }
        }

        System.out.println("Second Maximum Value is: "+secmax);
        System.out.println("Second Minimum Value is: "+secmin);
    }
}
