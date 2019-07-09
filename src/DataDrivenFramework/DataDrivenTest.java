package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	WebDriver driver;

	@Test(dataProvider = "testdata")
	public void DemoProject(String username, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();

		Thread.sleep(5000);

		Assert.assertTrue(driver.getTitle().matches("Sign-on: Mercury Tours:"), "Invalid credentials");
		System.out.println("Login successful");
	}

	@AfterMethod
	void ProgramTermination() {
		driver.quit();
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {

		ReadExcelFile config = new ReadExcelFile("C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\data\\credentials.xlsx");

		int rows = config.getRowCount(0);

		Object[][] credentials = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			credentials[i][0] = config.getData(0, i, 0);
			credentials[i][1] = config.getData(0, i, 1);
		}

		return credentials;
	}

}
