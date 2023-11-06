package program;

public class FibonacciSeries {

	//0 1 1 2 3  5  8 13 21 34
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print(a+" "+b);//printing 0 and 1
		for(int i=2;i<10;++i) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
