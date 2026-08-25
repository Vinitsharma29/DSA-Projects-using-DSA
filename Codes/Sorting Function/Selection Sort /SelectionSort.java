import java.util.*;
class InsertionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array Size
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];                         //Declaring Array

        // Entering elements of array as per size
        System.out.println("Enter "+size+" numbers of elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // Insertion Sort
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = arr[j];
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        // Printing Sorted Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
