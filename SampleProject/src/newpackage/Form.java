package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://demo.guru99.com/test/login.html";
		driver.get(url);
		
		WebElement email=driver.findElement(By.id("email"));
		
		WebElement pass=driver.findElement(By.id("passwd"));
		email.sendKeys("anu123@gmail.com");
		pass.sendKeys("anu123");
		System.out.println("text fields are set");
		
	//	email.clear();
		//pass.clear();
		//System.out.println("text fields are cleard");
		
		WebElement login=driver.findElement(By.id("SubmitLogin"));
	//	login.click();
		login.submit();
		System.out.println("form submitted");
		
		
		
	}

}
