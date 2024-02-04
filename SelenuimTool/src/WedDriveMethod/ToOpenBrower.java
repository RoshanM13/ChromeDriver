package WedDriveMethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenBrower {
	public static void main(String[] args) throws InterruptedException {
		// to open the chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// to see the execution
		Thread.sleep(2000);
		// to close the brower 
		driver.close();
		// to open the firefox brower
		FirefoxDriver driver1 = new FirefoxDriver();
		// to see the execution
		Thread.sleep(2000);
		// to close the brower 
		driver1.close();
		// to open the edge browser
		EdgeDriver driver2 = new EdgeDriver();
		// to see the execution
		Thread.sleep(2000);
		// to close the brower 
		driver2.close();
	}
}
