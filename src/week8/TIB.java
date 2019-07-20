package week8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TIB {
	WebDriver driver;
	@BeforeMethod
	public void SetDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.traininginbangalore.com");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void CloseDriver() {
		driver.close();
	}
	
	@Test
	public void ContactUs() throws InterruptedException {
	
		WebElement contactButton = driver.findElement(By.linkText("Contact"));
		
		//click on contact button
		contactButton.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Enter_Name")));
		
		
		
		//Name
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Suhasa");

		
		//Email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("suhasasj@gmail.com");
		
		//Course
		//String course_xpath = "//*[@id=\"select_course\"]/optgroup[11]/option[2]";
		//WebElement course = driver.findElement(By.xpath(course_xpath));
		//Select dropdown = new Select(course);
		//dropdown.selectByVisibleText("Selenium");
		
		//Course 
		//WebElement course = driver.findElement(By.id("select_course"));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", course);
		
		//select selenium
		//String selenium_xpath = "//*[@id=\"select_course\"]/optgroup[11]/option[2]";
		//WebElement selenium = driver.findElement(By.xpath(selenium_xpath));
		//executor.executeScript("arguments[0].click();", selenium);
		//Thread.sleep(5000);
		
		List<WebElement> courseList = driver.findElements(By.id("select_course"));
		int size = courseList.size();
		
		for(WebElement course : courseList)
		{
			try {
				new Select(course).selectByVisibleText("Selenium");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		Thread.sleep(4000);
		
		
		
		
		//Phone
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9686392852");
		
		//Message
		WebElement message = driver.findElement(By.id("message"));
		message.sendKeys("Just wanted to check about selenium course");
	
		Thread.sleep(3000);
		
		
	}
	
	
}
