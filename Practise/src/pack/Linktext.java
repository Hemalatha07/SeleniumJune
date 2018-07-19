package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktext {

	
	
	
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://redbus.in");
		WebElement hotelslink=d.findElement(By.linkText("BUS HIRE"));
//		WebElement hotelslink=d.findElement(By.partialLinkText("BUS"));
		hotelslink.click();
	}
}
