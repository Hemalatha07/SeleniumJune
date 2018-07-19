package file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(
				"");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement frames = driver.findElement(By.tagName("iframe"));

		frames.getSize();

		/*
		 * login.click();
		 * 
		 * driver.switchTo().alert().getText();
		 * driver.switchTo().alert().accept();
		 */

	}

}
