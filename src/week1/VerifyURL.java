package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
	public static void main(String[] args) {
		//setting a property of chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		
		//get URL
		String actURL=driver.getCurrentUrl();
		String expURL="https://www.google.com/";
		System.out.println("Actual URL is: "+actURL);
		//verify URL
		//actURL.equalsIgnoreCase(anotherString)
		if(actURL.contains(expURL)) {
			System.out.println("Valid URL");
		}
		else
		{
			System.out.println("Invalid URL");
			
		}
		
		driver.close();
	}
}
