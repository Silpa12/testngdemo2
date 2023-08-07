package Training_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePgm {
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		String url="https://demoqa.com/frames";
		driver.get(url);
		
		driver.manage().window().maximize();
		System.out.println("Switching to frame2");
		driver.switchTo().frame("frame2");
		//WebElement iframeelement = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
	//	driver.switchTo().frame(iframeelement);
		//System.out.println(iframeelement);
		//driver.quit();
		
		
		
	}

}
