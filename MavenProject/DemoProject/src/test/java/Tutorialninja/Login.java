package Tutorialninja;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
WebDriver driver;

@BeforeMethod

public void setup() {
	
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	String url="https://tutorialsninja.com/demo/";
	driver.get(url);
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
}
	
	
	@Test(priority=0)
	
	public void VerifyLoginWithValidCredentials()
	

	{
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("anu122@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("anu123")	;
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
	
	
	@Test(priority=1)
	
	public void VerifyLoginWithInvalidCredentials() {
		
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("anu\"+generateTimeStamp()+\"@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("67899")	;
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
		String ActualWarningmsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningmsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(ActualWarningmsg.contains(ExpectedWarningmsg),"Expected warning message is not displayed");
		
	}
	
	@Test(priority=2)
	
	public void LoginWithInvalidEmail() {
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("anu"+generateTimeStamp()+"@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("anu123")	;
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
		String ActualWarningmsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningmsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(ActualWarningmsg.contains(ExpectedWarningmsg),"Expected warning message is not displayed");
	}
	
	@Test(priority=3)
	
	public void LoginWithInvalidPassword() {
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("anu122@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("ghjgjhkj");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
		String ActualWarningmsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningmsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(ActualWarningmsg.contains(ExpectedWarningmsg),"Expected warning message is not displayed");
	}
	
	@Test(priority=4)
	
	public void LoginWithNoCredentails() {
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
		String ActualWarningmsg=driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningmsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(ActualWarningmsg.contains(ExpectedWarningmsg),"Expected warning message is not displayed");
	
		
	}
	
	
	@Test(priority=5)
	
	public void ForgotPassword() {
		
		WebElement forgot=driver.findElement(By.linkText("Forgotten Password"));
		forgot.isDisplayed();
		forgot.click();
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
		
	}
	
	
	
	@Test(priority=6)
	
	public void BrowsingBack() {
		
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("anu122@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("anu123")	;
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
		driver.navigate().back();
		
		
	}
	
	@Test(priority=7)
	
	public void LogoutButton() {
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("anu122@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("anu123")	;
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		
	}
	
	
	@Test(priority=8)
	
	public void NavigateDiffPage() {
		
		driver.findElement(By.linkText("Continue")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		
	}
	
	
	@Test(priority=9)
	
	public void FindPageHeading() 
	{
		
		System.out.println("Tittle="+driver.getTitle());
		System.out.println("Current URL="+driver.getCurrentUrl());
		
		
		
	}
	
	
	@AfterMethod(enabled=false)
	public void End() 
	{
		
		driver.quit();
	}
	
	
	
	 public String generateTimeStamp() 
	 {
		 Date date=new Date();
		 
		return date.toString().replace("", "").replace(":", "_");
		 
	 }

}
