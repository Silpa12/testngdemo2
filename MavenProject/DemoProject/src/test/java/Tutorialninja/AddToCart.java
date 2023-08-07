package Tutorialninja;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
public class AddToCart {
	
	
	WebDriver driver;
	 
	@BeforeClass
	public void testsetup() 
	
	
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		    

	}
	
	
	@BeforeMethod
	public void openBrowser() 
	{
		String url="https://tutorialsninja.com/demo/";
		driver.get(url);
	}
	
	
	
	@Test(priority=1)
	
	public void Login() 
	{
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		WebElement email_id=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email_id.sendKeys("anu122@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("anu123")	;
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
	}
	
	
	@Test(priority=2)
	public void Desktops()
	{
		
		
		driver.findElement(By.linkText("Desktops")).click();
		
		driver.findElement(By.linkText("Mac (1)")).click();
		
		
		driver.findElement(By.linkText("iMac")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,360)","");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")).click();
		
		js.executeScript("window.scrollBy(0,-360)","");

		System.out.println(driver.getTitle());
		
		
		WebElement quantity=driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
		quantity.clear();
		quantity.sendKeys("2");
	
		driver.findElement(By.id("button-cart")).click();
		driver.navigate().back();
		
       
	}
	
	
	
	@Test(priority=3)
	public void Cart()
	
	{
		 driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
	     driver.findElement(By.linkText("View Cart")).click();
	     
	     JavascriptExecutor js= (JavascriptExecutor) driver;
			
		 js.executeScript("window.scrollBy(0,360)","");
	     
	     WebElement coupn=driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a"));
	     coupn.click();
	     coupn.sendKeys("ABCD123");
	     
	     WebElement tax=driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a"));
	     tax.click();    
	     
	     Select country=new Select(driver.findElement(By.name("country_id")));
	     country.selectByVisibleText("India");
	     
	     Select region=new Select(driver.findElement(By.name("zone_id")));
	     region.selectByVisibleText("Kerala");
	     
	     WebElement postcode=driver.findElement(By.xpath("//*[@id=\"input-postcode\"]"));
	     postcode.clear();
	     postcode.sendKeys("686536");
	     
	    driver.findElement(By.xpath("//*[@id=\"button-quote\"]")) .click();
	     
	     
	}
	
	
	
	
	@Test(priority=4)
	
	public void Pop_up() throws InterruptedException {
		
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().back();
        Thread.sleep(10000);
		WebElement radio1=driver.findElement(By.xpath("//h4[text()='Please select the preferred shipping method to use on this order.']/parent::div/following::label/child::input"));
		 Actions action = new Actions(driver);
	     action.moveToElement(radio1).click().perform();
	       
		//radio1.click();
        Thread.sleep(5000);

        WebElement applyButton = driver.findElement(By.xpath("//input[@value='Apply Shipping']"));
        Actions actions1 = new Actions(driver);
       actions1.moveToElement(applyButton).click().perform();
       applyButton.click();		
	
	}
	
	@Test(priority=5)
    
    public void checkout() throws InterruptedException {
  	  
  	  
  	  //driver.navigate().back();
        Thread.sleep(5000);
  	  
   WebElement rem= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i"));
   
   Actions action = new Actions(driver);
   action.moveToElement(rem).click().perform();
   
   Thread.sleep(5000);
   
   WebElement cont=driver.findElement(By.linkText("Continue"));
   Actions action1 = new Actions(driver);
   action1.moveToElement(cont).click().perform();
  	  
    }
	
	
	@AfterClass(enabled=false)
	public void afterClass()
	{
	driver.quit();
	}

}

	


