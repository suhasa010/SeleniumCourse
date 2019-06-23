package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				//setting a property of Chrome
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
				
				// Initialize browser
				WebDriver driver=new ChromeDriver();
				//try {
					driver.get("https://www.google.com");
					driver.manage().window().maximize();
					
					
					WebElement googleApps = driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div[1]/a"));
					googleApps.click();
					
					Thread.sleep(4000);
					
					WebElement youtube = driver.findElement(By.xpath("//*[@id=\"gb36\"]"));
					youtube.click();
					
					WebElement cricket = driver.findElement(By.xpath("//*[@id=\"search\"]"));
					cricket.sendKeys("Cricket");
					cricket.sendKeys(Keys.ENTER);
				
					driver.close();
	}

}
