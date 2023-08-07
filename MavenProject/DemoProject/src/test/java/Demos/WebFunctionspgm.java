package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebFunctionspgm {
	
	@Test
	public void Webfunctions() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String url="https://demo.guru99.com/test/login.html";
		driver.get(url);
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("anu@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		pass.sendKeys("anu123");
		
	    email.clear();
		pass.clear();
		
		email.sendKeys("anu@gmail.com");
		pass.sendKeys("anu123");
		
		WebElement login=driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
		
		//login.click();
		
		//System.out.println("sucessfully clicked");
		
		login.submit();
		
            
		
	}

}
