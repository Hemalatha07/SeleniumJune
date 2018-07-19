package file;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://naukri.com");
		Set<String> ids = d.getWindowHandles();
		for (String id : ids)
		// {System.out.println(id);
		{
			d.switchTo().window(id);
			String title = d.getTitle();

			if (title.equals("Amazon")) {
				d.close();
			}

			if (title.equals("SYKES")) {
				d.close();
			}
		}
	}

}
