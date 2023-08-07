package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertText {
	
	public static void main(String args[]) {
		
	WebDriver driver=new ChromeDriver();
	
	 String url ="http://jsbin.com/usidix/1";
     driver.get(url);
		String alertmsg="";
		
		 driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		 alertmsg=driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 
		 System.out.println(alertmsg);
		 driver.quit();
	}

}
