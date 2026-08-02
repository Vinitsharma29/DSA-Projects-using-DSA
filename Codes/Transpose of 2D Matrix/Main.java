// Transpose of 2D Matrix 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row and column: ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] matrix = new int[row][column];
        
        System.out.println("Now enter the elements with "+row+" row & with "+column+" columns");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("2D matrix with "+row+" rows & with "+column+" columns.");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose of 2D matrix is: ");
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
