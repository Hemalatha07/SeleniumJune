package pack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {
	
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		
		
		
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5);
		act.keyUp(Keys.CONTROL).perform();
		
		
		
//		 driver.switchTo().alert().dismiss();
	}

}
