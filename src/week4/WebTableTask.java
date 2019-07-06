package week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting a property of Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		//try {
			driver.get("file:///C:/Users/Suhasa/Desktop/table.html");
			driver.manage().window().maximize();
			
//			List<WebElement> headers = driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr[1]/th"));
//			for (WebElement header : headers) {
//				System.out.println(header.getText());
//			}
			
		   List<WebElement>rows=driver.findElements(By.tagName("tr"));
		   String FirstPart="//table[@name='BookTable']/tbody/tr[";
		   String Subject = "]/td[3]";
		   String Price="]/td[4]";
		   String AuthorName = "]/td[2]";
		   String BookName = "]/td[1]";
		   
		   for(int i=2;i<=rows.size();i++)
		   {
			 if(driver.findElement(By.xpath(FirstPart+i+AuthorName)).getText() == "Mukesh") {
			     System.out.println(driver.findElement(By.xpath(FirstPart+i+Subject)).getText());
				 System.out.println(driver.findElement(By.xpath(FirstPart+i+Price)).getText());
				 System.out.println(driver.findElement(By.xpath(FirstPart+i+BookName)).getText());
			 }
			
		   }
		   driver.close();
	   }
	}
