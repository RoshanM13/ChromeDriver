package WedDriveMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateApplication {
	public static void main(String[] args) throws InterruptedException {
		// to open browser
		ChromeDriver driver = new ChromeDriver();
		// to open the application
		driver.get("https://www.facebook.com/");
		// to see the execution
		Thread.sleep(2000);
		// to close browser
		driver.close();
	}
}
