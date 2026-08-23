import java.util.*;
class BubbleSort{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter "+size+" number of elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt(); //Taking array input
        }

        // Bubble Sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Printing Sorted Array
        System.out.println("Sorted array is(Sorted using bubble sort): ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
