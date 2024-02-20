package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LintText {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximise
		dr.manage().window().maximize();
		// to open application
		dr.get("file:///D:/fireflink/DemoForLocators.html");
		// to click on the element 
		dr.findElement(By.linkText("FaceBook")).click();
		// to stop frr a while 
		Thread.sleep(2000);
		// to get the title of the application
		System.out.println(dr.getTitle());
		// to close the browser
		dr.quit();

	}
}
