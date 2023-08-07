package Demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickAlert {
	
	@Test
	public void doubleclick() {
		
           WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(link).perform();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();

		//driver.quit();
		
	}

}
