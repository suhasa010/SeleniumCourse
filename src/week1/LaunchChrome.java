package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		//setting a property of chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		
		//get title
		String pagetitle=driver.getTitle();
		
		System.out.println("Page Title is :"+ pagetitle);
		
		//get current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is : "+url);
		 
		//get page source
		String pagesource = driver.getPageSource();
		System.out.println("Page Source is: "+pagesource);
		
		
		
		// Close browser
		driver.close();
	}
}
