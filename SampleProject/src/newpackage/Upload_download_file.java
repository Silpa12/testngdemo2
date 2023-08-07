package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_download_file {

	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://demo.guru99.com/test/upload/";
		driver.get(url);
		
		WebElement uploadfile=driver.findElement(By.id("uploadfile_0"));
		
		uploadfile.sendKeys("C:\\Users\\SilpaNair\\Desktop\\newhtml.html");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
	}
	
}
