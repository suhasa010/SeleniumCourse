package week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

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
		   String firstPart="//table[@name='BookTable']/tbody/tr[";
		   String secondPart="]/td[3]";
		   for(int i=2;i<=rows.size();i++)
		   {
			  System.out.println( driver.findElement(By.xpath(firstPart+i+secondPart)).getText());
		   }
			
			driver.close();
	}

}
