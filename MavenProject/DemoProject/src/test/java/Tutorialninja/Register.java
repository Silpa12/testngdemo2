package Tutorialninja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Register {
	
	WebDriver driver;

	@BeforeMethod

	public void setup() {
		
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://tutorialsninja.com/demo/";
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
		
	@Test
	
	public void RegisterWithMandatoryFields() {
	
	WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
	FirstName.sendKeys("soni");
	
	WebElement LastName=driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
	LastName.sendKeys("k");
	
	WebElement Email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
	Email.sendKeys("soni@gmail.com");
	
	WebElement Telephone=driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
	Telephone.sendKeys("5678904323");
	
	WebElement Password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
	Password.sendKeys("soni123");
	
	WebElement PassCon=driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
	PassCon.sendKeys("soni123");
	
	
	WebElement radio1=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
	WebElement radio2=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));		
	
	
	WebElement option1 = driver.findElement(By.name("agree"));
	 option1.click();			

    driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).submit();
    
    String Successmsg=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
    Assert.assertEquals(Successmsg,"Your Account Has Been Created!","Account Success page is not displayed");
        
	}
	
	
	
	
	
	@AfterMethod
	public void End() {
		
		driver.quit();
	}
	
	
}
