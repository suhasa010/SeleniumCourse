package week5;

import org.testng.annotations.Test;

public class TestNGGroups {
@Test(groups = "smoke")
public void Login()
{
System.out.println("It is Login Page");
}
@Test(groups = "regression")
public void Home()
{
System.out.println("It is Home Page");
}
@Test(dependsOnMethods = "Login" ,groups = "regression")
public void HomeProfile()
{
System.out.println("It is Home-profile Test Page");
}
//Passing the multiple methods in depends on
@Test(dependsOnMethods = {"Login"},groups= {"smoke","regression"})
public void LogOut()
{
System.out.println("It is Log out");
}
@Test(invocationCount = 10)
public void iterationTest()
{
System.out.println("Iteration Test");
}

}

