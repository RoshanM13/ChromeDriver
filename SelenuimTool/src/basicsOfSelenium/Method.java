package basicsOfSelenium;

public class Method {
	
	static {
		System.out.println("it is from the static block ");
		test();
	}
	
	public static void test() {
		System.out.println("it is from the test method ");
	}
	
	public static void main(String[] args) {
    System.out.println("beging of the Main methode");
    test();
    System.out.println("end from the Main methode ");  
	}
}
