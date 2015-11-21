package day17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	
	@Test
	public void  alertHandleTest() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('hello world');");
		
		Thread.sleep(4000);
		alertHandle();
		
		
		
	}
	public void alertHandle()
	{
		
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e)
		{
			
		}
	}

}
