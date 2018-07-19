package file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("www.google.com");

		int count = 0;
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println("list size" + links.size());

		for (WebElement link : links) {

			if (!link.getText().equals("")) {
				System.out.println(link.getText());
				count = count + 1;
			}

		}
		System.out.println("No of Texts" + count);

	}

}
