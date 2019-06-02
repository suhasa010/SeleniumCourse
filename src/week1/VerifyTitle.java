package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) {
		//setting a property of chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		
		//get title
		String actPagetitle=driver.getTitle();
		String expPageTitle="Google";
		
		//verify pagetitle
		if(actPagetitle.equals(expPageTitle)) {
			System.out.println("Valid page has displayed");
		}
		else
		{
			System.out.println("Invalid page has displayed");
		}
		
		driver.close();
	}
}
