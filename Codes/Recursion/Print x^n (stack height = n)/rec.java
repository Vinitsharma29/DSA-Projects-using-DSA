class rec{
    public static int calpower(int x,int n){
        if(n==0){
            return 1; //base case 1
        }
        if(x == 0){
            return 0; //base case 2
        }
        int xpowernm1 = calpower(x, n-1);
        int xpown = x * xpowernm1;
        return xpown;
    }
    public static void main(String[] args){
        int x=2,n=5;
        int ans = calpower(x, n);
        System.out.println(ans);
    }
}
