package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifypagetitle(String browserName) {
		
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))	
		{
			//System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://learn-automation.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	

}
