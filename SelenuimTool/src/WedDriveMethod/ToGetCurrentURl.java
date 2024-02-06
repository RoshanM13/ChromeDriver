package WedDriveMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentURl {
	public static void main(String[] args) {
		// to open the browser
		ChromeDriver driver = new ChromeDriver();
		// to navitage to the application
		driver.get("https://www.facebook.com/");
		// to get the title 
		String title = driver.getTitle();
		// to display on console
		System.out.println(title);
		// to get current url
		String url = driver.getCurrentUrl();
		// to print the url on console
		System.out.println(url);
		// to close the close 
		driver.close();
	}
}
