

package week7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxTest {

	@Test
	public void checkBoxTesting() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");

		List<WebElement> toolCheckBox = driver.findElements(By.name("tool"));
		int size =toolCheckBox.size();
		for(int i=0;i<size;i++)
		{
			if(i!=0)
			{
				for(int j=i-1;j<i;j++)
				{

					toolCheckBox.get(j).click();

				}

			}

			toolCheckBox.get(i).click();
			Thread.sleep(3000);
		}

		driver.close();

	}
}
