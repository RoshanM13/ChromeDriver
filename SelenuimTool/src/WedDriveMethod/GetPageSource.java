package WedDriveMethod;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		FirefoxDriver dr = new FirefoxDriver();
		// to open the application
		dr.get("https://www.facebook.com/");
		// to get title 
		System.out.println(dr.getTitle());
		// to get the current url
		System.out.println(dr.getCurrentUrl());
		// to ger page source
		String ps = dr.getPageSource();
		// to display
		System.out.println(ps);
		// to stop the execution for period of tie
		Thread.sleep(2000);
		// to close the browser
		dr.close();
	}
}
