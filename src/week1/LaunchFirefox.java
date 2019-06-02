package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		// Close browser
		driver.close();
	}
}
