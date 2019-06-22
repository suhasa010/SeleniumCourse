package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
				
				// Initialize browser
				WebDriver driver=new ChromeDriver();
				 
				// Open Google
				driver.navigate().to("http://www.google.com");
				
				Thread.sleep(5000);

				String googletitle = driver.getTitle();
				System.out.println("Google title is "+googletitle);
				
				driver.navigate().refresh();
				WebElement gmail = driver.findElement(By.className("gb_d"));
				gmail.click();
				
				String gmailtitle = driver.getTitle();
				System.out.println("Gmail title is "+gmailtitle);
				
				Thread.sleep(3000);
				
				driver.navigate().back();
				Thread.sleep(5000);
				
				String backtitle = driver.getTitle();
				System.out.println("Google title is "+backtitle);

				if(driver.getTitle().equals(googletitle))
				{
					System.out.println("Get navigate to google page success");
				}
				else
					System.out.println("not able to navigate");
				
				driver.close();
	}

}
