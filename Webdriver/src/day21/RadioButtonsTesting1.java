package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonsTesting1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
	}
	
	@Test
	public void radioButtonsTest()
	{
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radio=block.findElements(By.name("group1"));
		for(int i=0;i<radio.size();i++)
		{
			System.out.println(radio.get(i).getAttribute("value")+"--"+radio.get(i).getAttribute("checked"));
		}
	}

}
