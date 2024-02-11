package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlDemo {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
        dr.get("file:///D:/fireflink/FaceBookAndGit.html");
        // to click on the elemetn with help of tagNAme
        dr.findElement(By.tagName("b")).click();
        dr.navigate().back();
        WebElement we = dr.findElement(By.id("d1"));
        we.click();
        String title = dr.getTitle();
        System.out.println(title);
        // to click on browser back button
        dr.navigate().back();
        WebElement we1 = dr.findElement(By.name("n2"));
        we1.click();
        String url = dr.getCurrentUrl();
        System.out.println(url);
        // to navigate 
        dr.navigate().back();
        dr.findElement(By.className("c1")).click();
        String title1 = dr.getTitle();
        System.out.println(title);
        // to close
        dr.quit();
	}
}
