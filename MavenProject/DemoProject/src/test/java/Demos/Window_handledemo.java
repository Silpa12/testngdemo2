package Demos;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Window_handledemo {
	
	@Test
	
	public void windowhandle() {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("http://www.naukri.com/");

	
	String parent=driver.getWindowHandle();

	Set<String> s =driver.getWindowHandles();

	Iterator<String> I1= s.iterator();

	while(I1.hasNext())
	{

	String child=I1.next();

	if(!parent.equals(child))
	{
	driver.switchTo().window(child);

	System.out.println(driver.switchTo().window(child).getTitle());

	driver.close();
	}

	}
	driver.switchTo().window(parent);

	}

}
