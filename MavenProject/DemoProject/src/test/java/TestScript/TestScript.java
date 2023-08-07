package TestScript;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Home;
import Pages.Login;
import Pages.WelcomeUser;

public class TestScript {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://tutorialsninja.com/demo/";
		driver.get(url);
		
		Home home_obj = new Home(driver);
		
		Login login_obj = new Login(driver);

		WelcomeUser Welcome_obj = new WelcomeUser(driver);
		
		
		home_obj.clickLogin();
	    login_obj.enterEmail("anu122@gmail.com");
	    login_obj.enterPassword("anu123");
        login_obj.clickLogin();
		Thread.sleep(3000);

		System.out.println("The page heading is --- " +Welcome_obj.getHeading());

        Welcome_obj.clickLogout();
        driver.quit();

	}

	
	
}
