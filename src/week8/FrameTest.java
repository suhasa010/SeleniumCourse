package week8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest {
		
		WebDriver driver;
		@BeforeMethod
		public void Driver() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get("https://www.toolsqa.com/iframe-practice-page/");
		}
		
		@AfterTest
		public void CloseDriver() {
			driver.close();
	}
		@Test
		public void FrameTest1() throws InterruptedException {
			String blogs_xpath = "//html[@class=\"no-js\"]/body/div/div/header/nav/ul/li[6]/a/span/span[text()='Blogs']";
			
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			for(int i = 0; i < frames.size(); i++)
			{
				
				driver.switchTo().frame(frames.get(i));
				try
				{
					WebElement blogs = driver.findElement(By.xpath(blogs_xpath));
					blogs.click();
					//screenshot of the frame
					WebElement framescreen = driver.findElement(By.xpath("//*[@id=\"IF1\"]"));
					File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					BufferedImage fullimage = ImageIO.read(screenshot);
					
					//get location
					Point point = framescreen.getLocation();
					
					//get width and height 
					int eleWidth = framescreen.getSize().getWidth();
					int eleHeight = framescreen.getSize().getHeight();
					
					//crop entire page screenshot to only frame
					BufferedImage framescreenimage= fullimage.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
					ImageIO.write(framescreenimage, "png", screenshot);
					
					//copy logo screenshot to disk
					File location = new File("C:\\tmp\\framescreen.png");
					FileUtils.copyFile(screenshot, location);
					Thread.sleep(5000);
					break;
					
				}
				catch (Exception e)
				{
					System.out.println(e);
					System.out.println("Element is not visible");
				}
				driver.switchTo().defaultContent();
				
			}
			//blogs.click();
			Thread.sleep(5000);
			
		}
		
}
