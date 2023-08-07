package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
        this.driver = driver;
	}
	
	By email_id=By.xpath("//*[@id=\"input-email\"]");
	By password=By.xpath("//*[@id=\"input-password\"]");
	By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
			
	public void enterEmail(String email) {
		driver.findElement(email_id).sendKeys(email);
	}


	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(login).click();
	}
}
