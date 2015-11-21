package day2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://bing.com");
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
