package Training_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm1 {
	 
	public static void main(String args[]) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.softwaretestinghelp.com/");
	 
	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	int numberOfTags = elements.size();
	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
	 
	System.out.println("Switching to the frame");
	driver.switchTo().frame("aswift_0");
	 
	System.out.println("Frame Source" +driver.getPageSource());
	 
	driver.switchTo().defaultContent();
	 
	driver.quit();
	}

}
