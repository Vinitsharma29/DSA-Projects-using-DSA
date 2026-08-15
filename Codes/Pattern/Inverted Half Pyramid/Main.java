// Inverted Half Pyramid
class Main{
    public static void main(String[] args){
        System.out.println("Inverted Half Pyramid");
        for(int i=0;i<10;i++){
            for(int j=0;j<10-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
