package week5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGOrder {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("It is Before Method");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("It is after Method");
	}

	@Test
	public void atest3()
	{
		System.out.println("It is test 3");
	}

	@Test
	public void btest1()
	{
		System.out.println("It is test 1");
	}

	@Test
	public void ctest2()
	{
		System.out.println("It is test 2");
	}



	@BeforeClass
	public void beforeClass()
	{
		System.out.println("It is Before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("It is after class");
	}
}

