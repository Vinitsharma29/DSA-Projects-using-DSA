// Write an infinite loop using do while condition.
class Main{
    public static void main(String[] args){
        System.out.println("Infinite Loop Example");
        int i = 0 ;
        do{
            System.out.println("Hello");
            i++;
        }
        while(i<++i);
    }
}
