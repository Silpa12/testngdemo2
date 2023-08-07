package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		String url="https://demo.guru99.com/test/radio.html";
		driver.get(url);
		
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		WebElement radio2=driver.findElement(By.id("vfb-7-2"));
		WebElement radio3=driver.findElement(By.id("vfb-7-3"));
       
		radio1.click();
		radio2.click();
		radio3.click();
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

      option1.click();			

  
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
		driver.close();
		
	}

}
