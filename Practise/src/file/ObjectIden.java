package file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectIden {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		/*
		 * d.get("http://ebay.in"); d.manage().window().maximize();
		 * 
		 * d.findElement(By.id("gh-ac")).sendKeys("mobiles"); //
		 * d.findElement(By.id("gh-btn")).click;
		 * 
		 * 
		 */
		d.get("http://facebook.com");
		d.manage().window().maximize();
		
		d.findElement(By.id("email")).sendKeys("cindrella_simphson@yahoo.com");
		d.findElement(By.id("pass")).sendKeys("");
		d.findElement(By.id("u_0_2")).click();

	}

}
