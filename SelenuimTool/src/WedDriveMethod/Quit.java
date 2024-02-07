package WedDriveMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) {
		// to open the browser
		ChromeDriver dr = new ChromeDriver();
		// to maxisise
		dr.manage().window().maximize();
		// to open the application
		dr.get("https://www.amazon.in/");
		// to get the title 
		String title = dr.getTitle();
		System.out.println(title);
		dr.navigate().to("https://www.flipkart.com/");
		// to get the current url
		String curl = dr.getCurrentUrl();
		System.out.println(curl);
		// to minimise 
		dr.manage().window().minimize();
		// to click on back
		dr.navigate().back();
		// to refresh the browser
		dr.navigate().refresh();
		// to ger current url
		String aurl = dr.getCurrentUrl();
		// to print on the console
		System.out.println(aurl);
		// to click on forword
		dr.navigate().forward();
		// to close the browser
        dr.quit();
	}
}
