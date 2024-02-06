package WedDriveMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		ChromeDriver dr = new ChromeDriver();
		// to open the application
		dr.get("https://www.facebook.com/");
		// to maximise the browser
		dr.manage().window().maximize();
		// to stop the excecution
		Thread.sleep(2000);
		// to minimise the browser
		dr.manage().window().minimize();
		// to close the browser
		dr.close();
	}
}
