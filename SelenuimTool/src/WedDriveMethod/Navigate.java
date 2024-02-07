package WedDriveMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		ChromeDriver dr = new ChromeDriver();
		// to maximize
		dr.manage().window().maximize();
		// to open the application
		dr.get("https://www.amazon.in/");
		// to wait for seconds
		Thread.sleep(2000);
		// to navaigete to application
		dr.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		// to click refress button
		dr.navigate().refresh();
		Thread.sleep(2000);
		// to click back button
		dr.navigate().back();
		Thread.sleep(2000);
		// to refress the browser
		dr.navigate().refresh();
		Thread.sleep(2000);
		// to click on forward button
		dr.navigate().forward();
		Thread.sleep(2000);
		// to close the browser
		dr.close();
	}
}
