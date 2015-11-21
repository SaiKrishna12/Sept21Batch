package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait_WebdriverWait {
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
	public void waitTest()
	{
		WebDriverWait mywait=new WebDriverWait(driver,30);
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a"))).click();
		
		
	}

}
