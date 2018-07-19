package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Examples {

	public static void main(String[] args) {
			  
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		String expectTitle="Google";
		
		if (actualTitle.equals(expectTitle)) {
			System.out.println("Test Case Pass");
		}	else {
			System.out.println("Test Case Fail");
		}
		
	}
}
	