package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rajnikanth {
	public static void main(String[] args) {
		//setting a property of chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		
		//get Page source
		String source=driver.getPageSource();
		String expString="Rajnikanth";
		
		//verify String is present or not
		if(source.contains(expString)) {
			System.out.println("Rajnikanth is present");
		}
		else {
			System.out.println("Rajnikanth is not present");			
		}
		
		driver.close();
	}
}