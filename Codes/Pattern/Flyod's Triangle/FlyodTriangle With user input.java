import java.util.*;
class Floydtriangle{
    public static void flyod(int no){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial number(Ex: 1): ");
        int num = sc.nextInt();
        System.out.println("Output is: ");
        for(int i=0;i<=no;i++){
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value so that loop can execute for that time: ");
        int no = sc.nextInt();
        flyod(no);
    }
}
