package week4;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleLogo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//setting a property of Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		//try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			//whole page screenshot
			WebElement googlelogo = driver.findElement(By.id("hplogo"));
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage fullimage = ImageIO.read(screenshot);
			
			//get location of google logo
			Point point = googlelogo.getLocation();
			
			//get width and height of google logo
			int eleWidth = googlelogo.getSize().getWidth();
			int eleHeight = googlelogo.getSize().getHeight();
			
			//crop entire page screenshot to only google logo screenshot
			BufferedImage googlelogoimage= fullimage.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
			ImageIO.write(googlelogoimage, "png", screenshot);
			
			//copy logo screenshot to disk
			File location = new File("C:\\tmp\\googlelogo.png");
			FileUtils.copyFile(screenshot, location);
			
			driver.close();
			
	}
}
