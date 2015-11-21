package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting4 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://goair.in");
		WebElement fromdrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> fromdropdown=fromdrop.findElements(By.tagName("option"));
		for(int i=0;i<fromdropdown.size();i++)
		{
			String city=fromdropdown.get(i).getText();
			fromdropdown.get(i).click();
			WebElement todrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			if(todrop.getText().contains(city))
			{
				System.out.println(city+" is not working correctly");
			}
			else
			{
				System.out.println(city+" is  working correctly");
			}
		}
	}

}
