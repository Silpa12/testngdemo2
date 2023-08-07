package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.JavascriptExecutor;

public class Task2Selectors {
   
	@Test
	public void Path() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String url="https://demo.guru99.com/test/facebook.html";
		driver.get(url);
		//driver.findElement(By.id("email")).sendKeys("anu@gmail.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("anu@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("anu");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("anu");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).submit();
	
		
	}
}
