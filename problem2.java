import java.lang.*;
import java.util.*;

public class problem2 
{
      static int checkPos(String str){
		int count =0;
		StringBuilder str2 =new StringBuilder(str);
		str2 = str2.reverse();

		for( int i= 0;i<str.length(); i++){
			if(str.charAt(i)==str2.charAt(i))
				count++;

		}
		System.out.println(str2);
		return count;
    }

	public static void main (String[] args){
	  	String s = "alphxxdida";
	  	System.out.println(s);
	  	
	  	System.out.println(checkPos(s));
    }
}
