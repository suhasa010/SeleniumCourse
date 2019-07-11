package week7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest {
	@Test
	public void selectCountrytest() throws InterruptedException
	{
	WebDriver driver= new ChromeDriver();
	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement country= driver.findElement(By.name("country"));
	Select dropdown=new Select(country);
	Thread.sleep(5000);
	dropdown.selectByIndex(1);
	Thread.sleep(5000);
	dropdown.selectByValue("106");
	Thread.sleep(5000);
	dropdown.selectByVisibleText("INDIA");
	Thread.sleep(5000);
	driver.close();

	}
}

