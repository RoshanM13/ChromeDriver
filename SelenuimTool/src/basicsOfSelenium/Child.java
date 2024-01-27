package basicsOfSelenium;

public class Child extends Parent {
	public static void main(String[] args) {
		// static members we cab access directly
		System.out.println(name);
		display();
		/* whenever we want to access the non static member of parent class 
		 * we should have create object
		 */
		Child c = new Child();
		// these are the non static member 
		System.out.println(c.c);
		c.add();
		// these are the static members we can access with help of object  
		c.display();
	
	}

}
