package newpackage;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgClick {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		String url= "http://demo.guru99.com/test/newtours/";
		driver.get(url);
		WebElement Home_link=driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div"+ "/table/tbody/tr/td"
                +"/table/tbody/tr/td"+ "/table/tbody/tr/td" + "/table/tbody/tr")); 
		
		Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(Home_link).build();
        
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();
	}

}
