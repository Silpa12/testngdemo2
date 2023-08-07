package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplFindelements {
       
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		String url="http://demo.guru99.com/test/ajax.html";
		driver.get(url);
		List<WebElement> elements=driver.findElements(By.name("name"));
		System.out.println("No of elements="+elements.size());
		
		for(int i=0;i<elements.size();i++) {
			System.out.println("radio button text="+elements.get(i).getAttribute("value"));
		}
	}
}
