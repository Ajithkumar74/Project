package Collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
//Let's see a simple example of the Java LinkedHashSet class. Here you can notice that the elements iterate in insertion order.


public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
	}

}
