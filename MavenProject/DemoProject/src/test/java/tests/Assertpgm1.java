package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Assertpgm1 {

	String url="https://www.browserstack.com/";
	WebDriver driver;
	
	@BeforeTest
    public void launchBrowser() 
    {
    System.out.println("launching Chrome browser");
    driver = new ChromeDriver();
    driver.get(url);
    }

	@Test
	public void softAssert() {
	SoftAssert softAssert = new SoftAssert();
	String getActualTitle = driver.getTitle();
	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	softAssert.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	softAssert.assertNull(verifyTitle);
	softAssert.assertNotNull(verifyTitle);
	softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
	softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
	softAssert.assertAll(); 
	}
	
	 @AfterTest
     public void terminateBrowser()
    {
     driver.close();
     }
	
}
