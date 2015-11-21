package day12;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	//setting priority to test cases
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("Registration app");
	}
	//Ignoring test cases
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("Logout functionality");
	}
	@BeforeMethod
	public void function()
	{
		System.out.println("xyz");
	}
}

