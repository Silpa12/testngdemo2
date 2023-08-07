package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownpgm {
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.google.com/search?q=blazedemo&rlz=1C1CHBD_enIN1033IN1033&oq=blazzed&gs_lcrp=EgZjaHJvbWUqCQgBEAAYChiABDIGCAAQRRg5MgkIARAAGAoYgAQyDAgCEAAYChixAxiABDIPCAMQABgKGIMBGLEDGIAEMgkIBBAAGAoYgAQyCQgFEAAYChiABDIJCAYQABgKGIAEMgkIBxAAGAoYgAQyCQgIEAAYChiABDIJCAkQABgKGIAE0gEIOTgyM2owajeoAgCwAgA&sourceid=chrome&ie=UTF-8";
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();

		Select drpdwn=new Select(driver.findElement(By.name("fromPort")));
		drpdwn.selectByIndex(1);
		
		Select drpdwn1=new Select(driver.findElement(By.name("toPort")));
		drpdwn1.selectByIndex(2);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).submit();
		
	}

}
