package Demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {

	
	@Test
	public void AlertPgm() {
		
        WebDriver driver=new ChromeDriver();
		
		String url="https://demo.guru99.com/test/delete_customer.php";
		driver.get(url);
		
		driver.findElement(By.name("cusid")).sendKeys("56543");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		
		System.out.println(alertmsg);
		
		alert.accept();
		
	}
}
