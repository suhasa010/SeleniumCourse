package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitActionOnFlipkart {
	public static void main(String args[]) throws InterruptedException {
		//setting a property of Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		//try {
			driver.get("https://www.flipkart.com");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			WebElement closeLogin = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
			closeLogin.click();
			Thread.sleep(5000);
			
			WebElement infinix = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/div[1]/div[7]/div/a/div/img[2]"));
			
			WebDriverWait wait = new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.visibilityOf(infinix));
			infinix.click();
			
			Thread.sleep(5000);
			
			driver.close();
			
	}
}
