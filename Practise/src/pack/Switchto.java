package pack;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto {

	public void closewindow(WebDriver driver, String titletoclose) {

		Set<String> IDS = driver.getWindowHandles();
		for (String Windowid : IDS) {

			driver.switchTo().window(Windowid);
			String title = driver.getTitle();
			if (title.contains(titletoclose)) {
				driver.close();
			}
		}
	}

	public WebDriver OB() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void openurl(WebDriver driver, String URL) {
		driver.get("http://www.naukri.com");		
	}

	public static void main(String[] args) {
		Switchto G = new Switchto();
		WebDriver driver = G.OB();
		G.openurl(driver, "http/::naukri.com");
		G.closewindow(driver, "GBT");
		G.closewindow(driver, "Impetus");
	}
}