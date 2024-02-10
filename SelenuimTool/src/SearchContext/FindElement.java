package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver(); // upcasting casting
		// to maximize the browser
		dr.manage().window().maximize();
		// to open the application
		dr.get("https://www.facebook.com/");
		// to get the title 
		String title = dr.getTitle();
		System.out.println(title);
		// to find the element in the webpage
		WebElement we = dr.findElement(By.id("email"));
		Thread.sleep(2000);
		// to send the text to test 
		we.sendKeys("nandajuturu@gmail.com");
		Thread.sleep(2000);
		// to find the another element 
		dr.findElement(By.id("pass")).sendKeys("nandajuturu#770");
		Thread.sleep(2000);
		// to find the element and click on the element
		dr.findElement(By.name("login")).click();
		Thread.sleep(2000);
		// to close the browser
		dr.quit();
	}
}
