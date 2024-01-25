package basicsOfSelenium;

public class WhyObjects {
	// non static variable
	int a = 10 ;
	// static variable
	static int b = 20 ;
	// static block
	static {
		System.out.println("from the static");
	}
	// non static block
	{
		System.out.println("from the non static block");
	}
	// static method
	public static int add(int a , int b ) {
		int c = a+b ;
		return c ;
	}
	// non static method
	public  int sub(int a , int b ) {
		int c = a-b ;
		return c ;
	}
	// main methode
	public static void main(String[] args) {
		// creation of Object 
		WhyObjects r = new WhyObjects();
		System.out.println(add( 10 , 20 ));
		System.out.println(r.sub(50,40));
		// proper way to understanding 
		int result =  r.sub(500, 200 );
		System.out.println(result);
	}
}
