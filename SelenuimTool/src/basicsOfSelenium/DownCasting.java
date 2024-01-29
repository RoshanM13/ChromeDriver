package basicsOfSelenium;

public class DownCasting {
public static void main(String[] args) {
	/*
	 * DownCasting : the process of converting Super class reference into child Class referencce
	 * 
	 * Advantance of downCasting : 
	 */
	Parent1 p = new Child1(); // upcasting
	p.test();
	// p.verify();
	Child1 c = (Child1)p ;
	c.test(); // it is from parent class
	c.verify(); // it is from the child class
	
	
	
	
//	// typecasting operator ()
//	int a = 65 ;
//	char ch = (char)a ;
//	System.out.println(ch);
	
}
}
