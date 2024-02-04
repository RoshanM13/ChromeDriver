package WedDriveMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitle {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		ChromeDriver driver = new ChromeDriver();
		// to open the face book application
		driver.get("https://www.facebook.com/");
		// to stop the execution
		Thread.sleep(2000);
		// to get title of the application
		String title = driver.getTitle();
		// to dislay the title 
		System.out.println(title);
		// to close the browser
		driver.close();
	}
}
