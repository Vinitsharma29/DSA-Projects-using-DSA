import java.util.*;
class ArrayIsSorteedOrNot{
    public static void check(int arr[]){
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the "+size+" numbers of elements:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        // Checking sorted or not
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not Sorted!");
                return;
            }
        }
        System.out.println("Array is Sorted!");
    }
}
