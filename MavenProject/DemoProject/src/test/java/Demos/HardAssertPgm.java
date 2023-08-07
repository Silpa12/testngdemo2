package Demos;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HardAssertPgm {

	WebDriver driver= new ChromeDriver();
	
	String url="https://tutorialsninja.com/demo/index.php?route=account/login";
	
	
	@Test
	
	public void hardassert() 
	
	{
		
		//WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//String url="https://tutorialsninja.com/demo/index.php?route=account/login";
		driver.get(url);
		Assert.assertTrue(driver.getTitle().equals("aaa"));
		driver.findElement(By.id("input-email")).sendKeys("anus");
		driver.findElement(By.id("input-password")).sendKeys("anu123");	
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
	}
	
	@Test
	
	public void Softassert()
	{
		 driver.get(url);
	     SoftAssert soft= new SoftAssert();
	     String ss=driver.getTitle();
	     System.out.println(ss);
	     soft.assertTrue(driver.getTitle().equals("Account Login"));
	     driver.findElement(By.id("input-email")).sendKeys("shilpa@gmail.com");
	     driver.findElement(By.id("input-password")).sendKeys("1234566");
	     driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
	     soft.assertAll();
	}
	
	
	
}
