package Exception.Throws;

import java.io.IOException;

class M {
	void method()throws IOException{
		throw new IOException("device error");
	}
}
public class Testthrow2 {
	public static void main(String[] args) {
		
	
	try {
		M m=new M();
		m.method();
	}catch(Exception e){
		System.out.println("Exception handled");
	}
	System.out.println("normal flow");
}
}
