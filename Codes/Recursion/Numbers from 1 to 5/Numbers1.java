class numbers1{
    // Printing number using Recursion
    public static void printn(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printn(n+1);
    }
    public static void main(String[] args){
        System.out.println("Printing number using loop");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("Printing number using Recursion");
        int n=1;
        printn(n);
    }
}
