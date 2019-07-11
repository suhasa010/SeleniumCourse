package week7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("header_topcat"))).build().perform();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.cssSelector("#software-testing-certification-courses"));
		builder.moveToElement(link).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).click();
		Thread.sleep(4000);
		WebElement act = driver.findElement(By.id("search-inp"));
		builder.moveToElement(act).build().perform();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//span[@class='typeahead__button']"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(3000);
		Action seriesOfActions;
		seriesOfActions = builder.sendKeys(act, "Selenium").keyDown(search, Keys.SHIFT).keyUp(search, Keys.SHIFT)
				.build();
		seriesOfActions.perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
