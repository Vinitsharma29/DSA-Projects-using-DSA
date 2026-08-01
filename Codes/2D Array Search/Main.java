// Take a matrix as input from the user. Search for a given Number
// x and print the indices at which occurs
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the size of and 2D array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int matrix[][] = new int[row][col];
        
        System.out.println("Enter the element of an array with row: "+row+" & column "+col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        
        System.out.println("The array is with row: "+row+" & column "+col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Enter the element to be searched: ");
        int x =sc.nextInt();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==x){
                    System.out.println(x+ " is present at row: "+i+" & column: "+j);
                }
            }
        }
    }
}
