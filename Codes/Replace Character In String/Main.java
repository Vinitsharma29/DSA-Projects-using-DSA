// Input a string from the user. Create a new string called ‘result’ in which you will 
// replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String name = sc.next();
        String result=""";
        
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)== 'e'){
                result+="i";
            }
            else{
                result+=name.charAt(i);
            }
        }
        
        System.out.println(result);
    }
}
