package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	
	public static void main(String args[]) {
		//setting a property of Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		//try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			//CSS selector by id
			//WebElement signin = driver.findElement(By.cssSelector("#gb_70"));
			//signin.click();		

			//driver.navigate().back();
			
			//CSS selector by class
			//WebElement signin2 = driver.findElement(By.cssSelector(".gb_Ud"));
			//signin2.click();
			
			//CSS selector by tag name
			//WebElement signin3 = driver.findElement(By.cssSelector("a.gb_Ud"));
			//signin3.click();
			
			//CSS selector by attribute
			WebElement signin4 = driver.findElement(By.cssSelector("input[name='q']"));
			signin4.sendKeys("India vs Afghanistan");
			//signin4.submit();
			signin4.sendKeys(Keys.ENTER);
			
			driver.close();
	}

}
