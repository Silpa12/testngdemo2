package newpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlepgm {

	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://demo.guru99.com/popup.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String mainwindw=driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> l1=s1.iterator();
		
		while(l1.hasNext()) {
			
			String childwindw=l1.next();
			
			if(!mainwindw.equalsIgnoreCase(childwindw)) {
				driver.switchTo().window(childwindw);
				driver.findElement(By.name("emailid")).sendKeys("silpa@gmail.com");
				
				driver.findElement(By.name("btnLogin")).submit();
				
				driver.close();
				
				
			}
		}
		
		driver.switchTo().window(mainwindw);
		
		
	}
}
