package week4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fiserv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting a property of Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe" );
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		//try {
			driver.get("https://www.fiserv.com");
			
			//Footer section
			WebElement footer = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[5]/div/footer/footer/div/div/div/div[3]/div/div/div/div/ul"));
			
			//Footer section links
			List<WebElement> links = footer.findElements(By.tagName("a"));
			
			for(int i=0; i <links.size(); i++)
			{
				if(!(links.get(i).getText().isEmpty())) 
					System.out.println(links.get(i).getText());
			}
				
		//}
		/*catch(Exception e) {
			driver.close();
		}
		finally
		{
			driver.close();
		}
			*/	
			
			driver.close();

	}
}
