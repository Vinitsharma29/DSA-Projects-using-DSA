class Numbers{
    // Priniting number 5-1 using recursion
    public static void printnumbers(int n){
        if(n==0){
        return;
        }
        System.out.println(n);
        printnumbers(n-1);
        
    }
    public static void main(String[] args) {
    System.out.println("Priniting number 5-1 using loop");
    for(int i=5;i>0;i--){
        System.out.println(i);
    } 
    int n=5;
    System.out.println("Priniting number 5-1 using recursion");
    printnumbers(n);
    }
}
