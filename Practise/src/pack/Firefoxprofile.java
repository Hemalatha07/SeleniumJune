package pack;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefoxprofile {

	public static void main(String[] args) {

		ProfilesIni ini = new ProfilesIni();
		FirefoxProfile fp = ini.getProfile("hemalatha");
		WebDriver driver = new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		Set<String> Fix = driver.getWindowHandles();
		for (String G : Fix) {
			driver.switchTo().window(G);
		}
		String title=driver.getTitle();
				if (title.equals("Amazon")) {
					driver.close();

		}
	}

}
