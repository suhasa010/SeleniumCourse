package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooLoginPage {
WebDriver driver;
String username="//*[@id='login-username']";
String signin = "//*[@id='login-signin']";
String errorMessage ="//*[@id='username-error']";
@BeforeMethod
public void launchBrowser()
{
driver=new ChromeDriver();
driver.get("https://login.yahoo.com/");
}
@Test
public void verifyLoginWithInvalidMailID()
{
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.findElement(By.xpath(username)).sendKeys("xyz@yahoo.com");
driver.findElement(By.xpath(signin)).sendKeys(Keys.ENTER);
WebDriverWait wait=new WebDriverWait(driver, 15);
WebElement ele=driver.findElement(By.xpath(errorMessage));
wait.until(ExpectedConditions.visibilityOf(ele));
Assert.assertTrue(driver.findElement(By.xpath(errorMessage)).isDisplayed(), "Error message has dispalyed");

}
@AfterMethod
public void trunketBrowser()
{
driver.close();
}



}
