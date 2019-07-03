package week5;
import org.seleniumhq.jetty9.server.HomeBaseWarning;
import org.testng.annotations.Test;
public class Priorities {
@Test()
public void Login()
{
System.out.println("It is Login Page");
}
@Test(dependsOnMethods = "Login")
public void Home()
{
System.out.println("It is Home Page");
}
//Multiple methods
@Test(dependsOnMethods = {"Home","Login"})
public void LogOut()
{
System.out.println("It is Log out");
}
}
