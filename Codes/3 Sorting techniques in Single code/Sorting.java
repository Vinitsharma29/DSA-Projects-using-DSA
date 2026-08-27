import java.util.*;
class Sorting{
    public static void bubblesort1(int arr[]){
        // Bubble Sort
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        //Printing sorted array
        System.out.println("Solved Usind Bubble Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    // Selection Sort
    public static void selectionsort1(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest] > arr[j]){
                    smallest = arr[j];
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        //Printing sorted array
        System.out.println("Solved Usind Selection Sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Insertionsort(int arr[]){
        int n = arr.length;
        // int i=0;
        for(int i=0;i<n;i++){
            int current = arr[i];
            int j= i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            // Placement
            arr[j+1] = current;
        }
        
        // Printing sorted array
        System.out.println("Solved using Insertion Sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter "+size+" numbers of elements:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Choose the sorting technique: 1.Bubble Sort \n2.Selection Sort\n3.Insertion Sort");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                bubblesort1(arr);
            break;
            case 2:
                selectionsort1(arr);
            break;
            case 3:
                Insertionsort(arr);
            break;
        }
    }
}
