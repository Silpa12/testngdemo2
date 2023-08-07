package Demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;



public class DemoSite {
	
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
	
	
	@Test(priority=0)
	public void Register()
	{
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		FirstName.sendKeys("shalu123");
		
		WebElement LastName=driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		LastName.sendKeys("S");
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		Email.sendKeys("shilpa88@gmail.com");
		
		WebElement Telephone=driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
		Telephone.sendKeys("9845799897");
		
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		Password.sendKeys("shalu");
		
		WebElement PassCon=driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
		PassCon.sendKeys("shalu");
		
		
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
		WebElement radio2=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));		
		
		
		WebElement option1 = driver.findElement(By.name("agree"));
		 option1.click();			

		  
	        if (option1.isSelected()) 
	        {					
	            System.out.println("Checkbox is Toggled On");					

	        } else 
	        {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
		
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).submit();
	        
	    // JavascriptExecutor js= (JavascriptExecutor) driver;
			
			//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	        
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	        driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Logout")).click();
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	
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
	     
	     
	}
	
      @Test(priority=4)
      
      public void checkout() throws InterruptedException {
    	  
    	  
    	  driver.navigate().back();
          Thread.sleep(5000);
    	  
     WebElement rem= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i"));
     
     Actions action = new Actions(driver);
     action.moveToElement(rem).click().perform();
    	  
      }
	
	
	
	@AfterClass(enabled=false)
	public void afterClass()
	{
	driver.quit();
	}

}
