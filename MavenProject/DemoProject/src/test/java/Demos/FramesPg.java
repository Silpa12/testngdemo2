package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesPg {

@Test
public void testFrames() {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	String url="https://demoqa.com/frames";
	driver.get(url);
	int total_frame=driver.findElements(By.tagName("iframe")).size();
	System.out.println("toal_frames="+total_frame);
	
	System.out.println("switching to frame2");
	driver.switchTo().frame("frame2");
	
	System.out.println("Frame Source" +driver.getPageSource());
	
	 
	driver.quit();
	
	
	
}


}
