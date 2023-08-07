package Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdwndemo {

	@Test
	public void drpdn(){
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String url="https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		driver.get(url);
	
}
}

