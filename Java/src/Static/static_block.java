package Static;

public class static_block {
	//Static block is used to initialize the static data member.
	//It is executed before the main method, at the time of classloading.
	static {
		System.out.println("static block is invoked");
	}
	public static void main(String[] args) {
		System.out.println("Hello main");
	}

}
