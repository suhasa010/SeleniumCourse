package week7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.get("http://jqueryui.com/droppable/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
WebElement SourceElement = driver.findElement(By.id("draggable"));
WebElement TargetElement = driver.findElement(By.id("droppable"));
Actions action = new Actions(driver);
Thread.sleep(3000);
action.dragAndDrop(SourceElement, TargetElement).build().perform();
// action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
Thread.sleep(3000);
driver.quit();

}

}
