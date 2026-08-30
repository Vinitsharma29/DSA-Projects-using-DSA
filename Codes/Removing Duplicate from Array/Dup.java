class Dup{
    public static void main(String[] args) {
     int[] arr = {1,1,2,3,5};
     int[] newarr = new int[5];
     int j=0;
     for(int i=0;i<arr.length-1;i++){
        if(arr[i] == arr[i+1]){
            continue;
        }
        else{
            newarr[j] = arr[i];
            j++;
        }
     }

    newarr[j] = arr[arr.length-1];
    j++;


    System.out.println("Original Array: ");
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();

     System.out.println("Array After removing Duplicate value");
     for(int i=0;i<j;i++){
        System.out.print(newarr[i]+" ");
     }
    //  System.out.println(newarr);
    }
}
