package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1Frames {
	
	@Test
	
	public void Frames() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String url="file:///C:/Users/SilpaNair/Desktop/myframe.html";
		driver.get(url);
		
		int total_frame=driver.findElements(By.tagName("iframe")).size();
		System.out.println("toal_frames="+total_frame);
		
		driver.switchTo().frame("guru");
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/a")).click();
		
		driver.close();
	}

}
