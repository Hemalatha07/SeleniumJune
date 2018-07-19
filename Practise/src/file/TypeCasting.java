package file;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeCasting {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window location='http://ebay.in'");
		driver.findElement(By.id("gh-ac")).sendKeys("Laptops");
		driver.findElement(By.id("gh-btn")).click();

		for (int i = 0; i <= 4; i++) {

			js.executeScript("Window.ScrollBy(0,768");
			Thread.sleep(3000);

		}

		
	}

}
