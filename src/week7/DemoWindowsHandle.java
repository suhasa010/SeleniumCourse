

package week7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWindowsHandle {
	@Test
	public void testWindowHandle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");

		WebElement newtab= driver.findElement(By.xpath("//p[5]/button"));
		WebElement windowsLink = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div/div/div/div/p[1]/span/a/em/strong"));
		String parrentWindow = driver.getWindowHandle();
		newtab.click();
		Thread.sleep(5000);

		Set<String>allWindowHandle = driver.getWindowHandles();
		for(String handle : allWindowHandle)
		{
			System.out.println(handle);
		}
		driver.switchTo().window(parrentWindow);
		System.out.println("It is parrent id Title "+driver.getTitle());
		Thread.sleep(10000);
		windowsLink.click();
		Thread.sleep(5000);
		System.out.println("It is child id Title "+driver.getTitle());

		driver.quit();

	}

}
