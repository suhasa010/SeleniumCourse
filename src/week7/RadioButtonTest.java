

package week7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
@Test
public void testRadioButton() throws InterruptedException
{
WebDriver driver = new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form");

List<WebElement> genderRadio = driver.findElements(By.name("sex"));
boolean bvalue=false;
for(int i=0;i<genderRadio.size();i++)
{
bvalue=genderRadio.get(i).isSelected();
if(bvalue == false)
{
genderRadio.get(i).click();
}

Thread.sleep(5000);
}

driver.close();
}

}
