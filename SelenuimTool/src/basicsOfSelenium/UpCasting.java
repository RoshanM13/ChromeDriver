package basicsOfSelenium;

public class UpCasting {
	public static void main(String[] args) {
		/* 
		 * Upcasting : the process of converting child class reference (address) into 
		 * Super class
		 * 
		 * Disadvantages of Upcasting : 
		 * ==> we cannot access child class members 
		 */
	Parent1 p = new Child1(); // upcasting
    System.out.println(p.s);
    p.test();
    //  p.verify();it is not passible
	
	}
}
