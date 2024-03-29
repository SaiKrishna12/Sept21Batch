package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {
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
	public void rightClickTest()
	{
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("Gmail"));
		action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
