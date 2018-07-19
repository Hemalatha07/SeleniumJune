package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwonBox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.in");
		WebElement ele = driver.findElement(By.id("gh-cat"));

		Select sel = new Select(ele);
		List<WebElement> items = sel.getOptions();

		sel.selectByValue("174982");
		String Item = sel.getFirstSelectedOption().getText();
		System.out.println(Item);

	}

}
