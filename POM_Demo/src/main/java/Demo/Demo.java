package Demo;

import org.openqa.selenium.By;
import GenericFunction.GenericFunctions;
import org.openqa.selenium.WebDriver;

public class Demo extends  GenericFunctions {

	WebDriver driver;

	public Demo(WebDriver driver) {
		super(driver);
	}

	
	//obstcle1
	By try1=By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[9]/a");
	By clickMe=By.xpath("//a[@class='btn theme-btn-color btn-lg animated fadeInDown delay-3 btn-big']");
	By submit=By.xpath("//button[@class='confirm']");
	
	

	
	public void clickTryOption() {
		findElement(try1).click();
	}
	
	public void clickMeOption() {
	findElement(clickMe).click();
	}
	
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	
	
}
