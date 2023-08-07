package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomeUser {
	 
	WebDriver driver;
	
	public WelcomeUser(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By heading = By.linkText("Edit your account information");
	By logoutBtn = By.linkText("Logout");
	
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	
	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}

}
