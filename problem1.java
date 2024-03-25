import java.lang.*;
import java.util.*;

public class problem1{

	static char encrypt(char ch,  int n){
		char res;
		int z = (int)(ch);
		if(Character.isUpperCase(ch)){
			res = (char)( (z+n-65) % 26 + 65);
		}
		else {
			res = (char)( (z+n-97) % 26 + 97);
		}

		return res;
    } 
	

	
	public static void main (String[] args){
	  	char c = 'D';
	  	int key =3;
	  	System.out.println(encrypt(c, key));

	  	c = 'h';
	  	key =23;
	  	System.out.println(encrypt(c, key));

        }
}
