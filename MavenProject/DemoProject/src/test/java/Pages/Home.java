package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver=driver;
	}

	//By Account=By.xpath("//li[@class='dropdown/a']");
	By loginbtn=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]");
	
	By Account=By.linkText("My Account");
	//By loginbtn=By.linkText("Login");
	
	
	public void clickAccount() {
		driver.findElement(Account).click();
	}
	
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}
	
}
