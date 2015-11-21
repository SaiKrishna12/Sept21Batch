package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImplicitWait {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
		
	}
	
	@Test
	public void implicitwaitTest()
	{
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='carousel-example-generic']/div/div[3]/div/div/div/span/a/i")).click();
	}

}
