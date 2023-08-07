package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {
	
	public static void main(String args[]) {
		
		String expectedtitle="google";
		
		WebDriver driver = new ChromeDriver();
	      String url ="https://www.google.com";
	      driver.get(url);
	     String actualtitle= driver.getTitle();
	     if(expectedtitle.contentEquals(actualtitle)) {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
	      

	}
	
	
	

}
