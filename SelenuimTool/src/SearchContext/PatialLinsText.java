package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatialLinsText {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximise 
		dr.manage().window().maximize();
		// to enter the url
		dr.get("file:///D:/fireflink/DemoForLocators.html");
		// to click the element 
		dr.findElement(By.partialLinkText("Face")).click();
		// to get the current url
		System.out.println(dr.getCurrentUrl());
		// to close the browser
		dr.quit();
	}
}
