package Tutorialninja;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddtoCart_cam {
	
	
	WebDriver driver;
	 
	@BeforeClass
	public void testsetup() 
	
	
	{
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		email_id.sendKeys("shalu1234@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("shalu")	;
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).submit();
		
	}
	
	
	@Test(priority=2)
	public void Camera()
	{
		
		
		driver.findElement(By.linkText("Cameras")).click();
		
		driver.findElement(By.linkText("Nikon D300")).click();

		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
	
		driver.findElement(By.id("button-cart")).click();		
       
	}
	
	
	@Test(priority=3)
	public void Cart()
	
	{
		 driver.findElement(By.xpath("//*[@id=\"cart-total\"]")).click();
	     driver.findElement(By.linkText("View Cart")).click();
	     
	     JavascriptExecutor js= (JavascriptExecutor) driver;
			
		 js.executeScript("window.scrollBy(0,360)","");
	     
		 driver.findElement(By.linkText("Checkout")).click();
		      
	}
	
	@Test(priority=4)
	public void Billing_details() throws InterruptedException {
		
		driver.navigate().back();
        Thread.sleep(6000);
		
		WebElement radio1=driver.findElement(By.id("input-payment-firstname"));
		
		  Actions action = new Actions(driver);
	     action.moveToElement(radio1).click().perform();
		
        Thread.sleep(3000);
        
        driver.findElement(By.id("input-payment-firstname")).sendKeys("annu");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("k");

        driver.findElement(By.id("input-payment-company")).sendKeys("Testhouse");

        driver.findElement(By.id("input-payment-address-1")).sendKeys("kazhakoottam");

        driver.findElement(By.id("input-payment-city")).sendKeys("kottayam");

        driver.findElement(By.id("input-payment-postcode")).sendKeys("560102");
        
        Select country=new Select(driver.findElement(By.id("country_id")));
		country.selectByValue("India");;
		
		Select region=new Select(driver.findElement(By.id("zone_id")));
		region.selectByValue("Kerala");
		
	     Thread.sleep(10000);
        
           WebElement con=   driver.findElement(By.xpath("//input[@value='Continue']"));
           
           Actions action1 = new Actions(driver);
  	       action1.moveToElement(con).click().perform();
             
           Thread.sleep(8000);
           
           WebElement con1=   driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));
           Actions action2 = new Actions(driver);
  	       action2.moveToElement(con1).click().perform();
  	       
  	      
	        
	     
	}
	
	
	
	
	
	@AfterClass(enabled=false)
	public void afterClass()
	{
	//driver.quit();
	}

}

	


