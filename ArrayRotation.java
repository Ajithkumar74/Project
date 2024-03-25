import java.lang.*;
import java.util.*;

public class ArrayRotation {
    static boolean isRotation(String s1, String s2){
     if(s1.length()==s2.length() && (s1+s1).indexOf(s2)!=-1)
                return true;
            else
                return false;
	
	}

	public static void main (String[] args){
	    String s1 = "Ajith";
        String s2 = "Kumar"; 
        System.out.println(isRotation(s1,s2));
        String s3 = "abcd";
        String s4 = "cdab"; 
        System.out.println(isRotation(s3,s4));
}
}