package file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathexample {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=laptops&marketplace=FLIPKART&otracker=start&as-show=on&as=off");
		List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_3wU53n']"));

		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));

		for (int i = 1; i < laptops.size(); i++) {
			System.out.println(laptops.get(i).getText());
			System.out.println(prices.get(i).getText());
		}
	}
}
