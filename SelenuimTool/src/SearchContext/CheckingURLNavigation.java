package SearchContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingURLNavigation {
	public static void main(String[] args) {
		// to check the right url
		String ex = "https://en-gb.facebook.com/";
		// to open the browser 
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://en-gb.facebook.com/");
        String ar = dr.getCurrentUrl();
        if(ex.equals(ar)) {
        	System.out.println("pass the test case");
        }else {
			System.out.println("fail the test case");
		}
        // to close the browser
        dr.quit();
	}
}
