import java.lang.*;
import java.util.*; 
public class problem3 {
    static int checkMisses(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'|| str.charAt(i)=='$' ||str.charAt(i)=='^')
            count++;
    }
    return count;
}
     public static void main (String[] args){
    String s = "aa a234bc@ sad$ hsagd^";
    System.out.println(s);
    
    System.out.println(checkMisses(s));
   }
}
