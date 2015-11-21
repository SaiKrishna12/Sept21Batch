package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputFields {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
	}
	
	@Test
	public void inputfieldsTest()
	{
		String[] str={"one","two","three","four","five","six","seven","eight"};
		
		List<WebElement> input=driver.findElements(By.xpath
				("//input[@type='text' or @type='password' or @type='email']"));
		System.out.println(input.size());
		for(int i=0;i<input.size();i++)
		{
			input.get(i).sendKeys(str[i]);
		}
		
		
		
		
		
		
		
	}

}
