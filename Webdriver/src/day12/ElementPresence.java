package day12;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementPresence {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
	}
	@Test
	public void  elementPresenceTest()
	{
		String str=driver.getPageSource();
		if(str.contains("Qedge"))
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	

}
