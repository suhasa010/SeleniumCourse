package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\IEDriverServer.exe");
		 
		WebDriver driver = new InternetExplorerDriver();
	    driver.get("http://www.google.com");
		
		// Close browser
		driver.quit();
	}
}
