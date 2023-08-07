package Demos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Famespgm1 {

	@Test
	public void frames() {
		
		
		WebDriver driver = new ChromeDriver();
		
		

		driver.get("https://www.softwaretestinghelp.com/");
		driver.manage().window().maximize();
		 
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int number = elements.size();
		System.out.println("No. of Iframes : " +number);
		 
		System.out.println("Switching to the frame");
		driver.switchTo().frame("__tcfapiLocator");
		 
		System.out.println("Frame Source" +driver.getPageSource());
		 
		driver.switchTo().defaultContent();
		 
		driver.quit();
	}
	
	
	
}
