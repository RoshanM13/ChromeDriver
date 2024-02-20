package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximise the browser
		dr.manage().window().maximize();
		// to enter url
		dr.get("file:///D:/fireflink/DemoForLocators.html");
		// to click on the element
		dr.findElement(By.cssSelector("a[class='c2']")).click();
		// to ger the title of the page 
		System.out.println(dr.getTitle());
		// to stop the execution
		Thread.sleep(2000);
		// to close the browser
		dr.quit();
	}
}
