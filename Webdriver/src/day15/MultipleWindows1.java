package day15;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
		
	}
	
	@Test
	public void multiplewindowTest()
	{
		
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
	}
	

}
